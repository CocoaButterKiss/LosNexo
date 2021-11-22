package upc.edu.pe.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;


import upc.edu.pe.repository.entities.Usuario;
import upc.edu.pe.service.input.IUsuarioService;

@Controller
@RequestMapping("/users")
public class UsuarioController {

    public static final String NEW_USER_PATH = "users/usuario";
    private final IUsuarioService uService;

    @Autowired
    public UsuarioController(IUsuarioService uService) {
        this.uService = uService;
    }

    @GetMapping("/new")
    public String newUsuario(Model model) {
        model.addAttribute("user", new Usuario());
        return NEW_USER_PATH;
    }


    @GetMapping("/list")
    public String listUsuarios(Model model) {
        try {
            model.addAttribute("user", new Usuario());
            model.addAttribute("listaUsuarios", uService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "users/listUsuarios";
    }


    @PostMapping("/save")
    public String saveUsuario(@Valid Usuario user, BindingResult result, Model model, SessionStatus status) {
        if (result.hasErrors()) {
            return NEW_USER_PATH;
        } else {
            int answer = uService.insert(user);
            if (answer > 0) {
                model.addAttribute("mensaje", "Ya existe");
                return NEW_USER_PATH;
            } else {
                model.addAttribute("mensaje", "Se guardó correctamente");
                status.setComplete();
            }
        }
        model.addAttribute("user", new Usuario());
        return "redirect:/users/list";
    }

}

