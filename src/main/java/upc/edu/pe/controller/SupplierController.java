package upc.edu.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

@Controller
@RequestMapping("/suppliers")
public class SupplierController {
	@Autowired
	private ISupplierService sService;

	@GetMapping("/new")
	public String newSupplier(Model model) {
		model.addAttribute("supplier", new Supplier());
		return "supplier/supplier";
	}

	@GetMapping("/list")
	public String listSuppliers(Model model) {
		try {
			model.addAttribute("supplier", new Supplier());
			model.addAttribute("listaProveedores", sService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "supplier/listSuppliers";
	}

	@PostMapping("/save")
	public String saveSupplier(@Valid Supplier supplier, BindingResult result, Model model, SessionStatus status)
			throws Exception {
		if (result.hasErrors()) {
			return "supplier/supplier";
		} else {
			int rpta = sService.insert(supplier);
			if (rpta > 0) {
				model.addAttribute("mensaje", "Ya existe");
				return "supplier/supplier";
			} else {
				model.addAttribute("mensaje", "Se guardó correctamente");
				status.setComplete();
			}
		}
		model.addAttribute("supplier", new Supplier());
		return "redirect:/suppliers/list";
	}
}
