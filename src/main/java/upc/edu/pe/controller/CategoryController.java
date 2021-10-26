package upc.edu.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import upc.edu.pe.serviceinterface.ICategoryService;

import javax.validation.Valid;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private ICategoryService cService;

	@GetMapping("/new")
	public String newCategory(Model model) {
		model.addAttribute("category", new Category());
		return "category/category";
	}

	@GetMapping("/list")
	public String listCategories(Model model) {
		try {
			model.addAttribute("category", new Category());
			model.addAttribute("listaCategorias", cService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "category/listCategories";
	}

	@PostMapping("/save")
	public String saveMarca(@Valid Category category, BindingResult result, Model model, SessionStatus status)
			throws Exception {
		if (result.hasErrors()) {
			return "category/category";
		} else {
			int rpta = cService.insert(category);
			if (rpta > 0) {
				model.addAttribute("mensaje", "Ya existe");
				return "category/category";
			} else {
				model.addAttribute("mensaje", "Se guardó correctamente");
				status.setComplete();
			}
		}
		model.addAttribute("category", new Category());
		return "redirect:/categories/list";
	}
}
