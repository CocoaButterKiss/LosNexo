package upc.edu.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import upc.edu.pe.serviceinterface.ICategoryService;
import upc.edu.pe.serviceinterface.IProductService;
import upc.edu.pe.serviceinterface.ISupplierService;
import upc.edu.pe.serviceinterface.IUploadFileService;

import javax.validation.Valid;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.Map;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private IProductService pService;
	@Autowired
	private ICategoryService cService;

	@Autowired
	private ISupplierService sService;

	@Autowired
	private IUploadFileService uploadFileService;

	@GetMapping("/new")
	public String newProduct(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("listaCategorias", cService.list());
		model.addAttribute("listaProveedores", sService.list());
		model.addAttribute("product", new Product());
		return "product/product";
	}

	@GetMapping("/list")
	public String listProducts(Model model) {
		try {
			model.addAttribute("product", new Product());
			model.addAttribute("listaProductos", pService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "product/listProducts";
	}

	@RequestMapping("/save")
	public String insertProduct(@ModelAttribute @Valid Product objPro, BindingResult binRes, Model model,
			@RequestParam("file") MultipartFile foto, RedirectAttributes flash, SessionStatus status)
			throws ParseException {
		if (binRes.hasErrors()) {
			model.addAttribute("listaCategorias", cService.list());
			model.addAttribute("listaProveedores", sService.list());
			return "product/product";
		} else {
			if (!foto.isEmpty()) {

				if (objPro.getIdProducto() > 0 && objPro.getPhotoProduct() != null
						&& objPro.getPhotoProduct().length() > 0) {

					uploadFileService.delete(objPro.getPhotoProduct());
				}

				String uniqueFilename = null;
				try {
					uniqueFilename = uploadFileService.copy(foto);
				} catch (IOException e) {
					e.printStackTrace();
				}

				flash.addFlashAttribute("info", "Has subido correctamente '" + uniqueFilename + "'");
				objPro.setPhotoProduct(uniqueFilename);
			}
			boolean flag = pService.insert(objPro);
			if (flag) {
				return "redirect:/products/list";
			} else {
				model.addAttribute("mensaje", "Ocurrió un error");
				return "redirect:/products/new";
			}
		}
	}

	@GetMapping(value = "/uploads/{filename:.+}")
	public ResponseEntity<Resource> verFoto(@PathVariable String filename) {

		Resource recurso = null;

		try {
			recurso = uploadFileService.load(filename);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + recurso.getFilename() + "\"")
				.body(recurso);
	}

	@GetMapping(value = "/view/{id}")
	public String view(@PathVariable(value = "id") int id, Map<String, Object> model, RedirectAttributes flash) {

		Product product = pService.listarId(id);

		if (product == null) {
			flash.addFlashAttribute("error", "El producto no existe en la base de datos");
			return "product/listProducts";
		}

		model.put("product", product);
		model.put("titulo", "Detalle de producto: " + product.getNameProduct());

		return "product/ver";
	}

	@RequestMapping("/list")
	public String listPorducts(Map<String, Object> model) {
		model.put("listaProductos", pService.list());
		return "product/listProducts";

	}

	@RequestMapping("/listarId")
	public String listarId(Map<String, Object> model, @ModelAttribute Product pro) {
		pService.listarId(pro.getIdProducto());
		return "product/listProducts";

	}

	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model, RedirectAttributes objRedir) {

		Product objPro = pService.listarId(id);
		if (objPro == null) {
			objRedir.addFlashAttribute("mensaje", "OcurriÃ³ un error");
			return "redirect:/products/list";
		} else {
			model.addAttribute("listaCategorias", cService.list());
			model.addAttribute("listaProveedores", sService.list());
			model.addAttribute("product", objPro);
			return "product/product";
		}
	}
}
