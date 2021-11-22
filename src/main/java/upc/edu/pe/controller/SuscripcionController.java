package upc.edu.pe.controller;


import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import upc.edu.pe.repository.entities.Suscripcion;
import upc.edu.pe.service.input.ISuscripcionService;
import upc.edu.pe.service.input.IUsuarioService;

@Controller
@RequestMapping("/suscripciones")
public class SuscripcionController {

    private final ISuscripcionService sService;
    private final IUsuarioService uService;

    @Autowired
    public SuscripcionController(ISuscripcionService sService, IUsuarioService uService) {
        this.sService = sService;
        this.uService = uService;
    }

    @GetMapping("/new")
    public String newSuscripcion(Model model) {
        model.addAttribute("suscripcion", new Suscripcion());
        model.addAttribute("listaUsuarios", uService.list());
        model.addAttribute("suscripcion", new Suscripcion());
        return "suscripcion/suscripcion";
    }

    @GetMapping("/list")
    public String listSuscripcion(Model model) {
        try {
            model.addAttribute("suscripcion", new Suscripcion());
            model.addAttribute("listaSuscripciones", sService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "suscripcion/listSuscripcion";
    }

    @RequestMapping("/save")
    public String insertSuscripcion(@ModelAttribute @Valid Suscripcion objPro, BindingResult binRes, Model model,
                                    RedirectAttributes flash, SessionStatus status)
            throws ParseException {
        if (binRes.hasErrors()) {
            model.addAttribute("listaCategorias", uService.list());
            return "suscripcion/suscripcion";
        } else {

            boolean flag = sService.insert(objPro);
            if (flag) {
                return "redirect:/suscripciones/list";
            } else {
                model.addAttribute("mensaje", "Ocurrió un error");
                return "redirect:/suscripciones/new";
            }
        }
    }


}
