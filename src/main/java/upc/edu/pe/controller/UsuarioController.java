package pe.edu.upc.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import upc.edu.pe.entities.*;
import upc.edu.pe.repository.IUsuarioRepository;
import upc.edu.pe.serviceinterface.*;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    private final IUsuarioService usuarioService;

    @Autowired
    public UsuarioController(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @PostMapping("/create")
    public String registrar(@ModelAttribute("objUsuario") @Valid Usuario objUsuario, BindingResult binRes, Model model)
            throws ParseException {
        if (binRes.hasErrors()) {
            return "AñadirUsuario";
        } else {
            objUsuario.set(new Date());

            boolean flag = clientService.insertar(objCliente);
            if (flag) {
                return "redirect:/cliente/listar";
            } else {
                model.addAttribute("mensaje", "Sucedio un error");
                return "redirect:/credito/irRegistrar";
            }
        }
    }

    @GetMapping("/create")
    public String showClientCreateForm(Model model) {
        model.addAttribute("objCliente", new Cliente());
        return "Añadir_cliente";
    }

    @GetMapping("/irRegistrarCliente")
    public String irRegistrar(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "registro";
    }

    @RequestMapping("/eliminar")
    public String eliminar(Map<String, Object> model, @RequestParam(value = "id") Integer id) {
        try {
            if (id != null && id > 0) {
                clientService.eliminar(id);
                model.put("listCreditos", clientService.listar());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            model.put("mensaje", "sucedio un error");
            model.put("listCreditos", clientService.listar());
        }
        return "listCredito";
    }

    @RequestMapping("/listar")
    public String listar(Map<String, Object> model) {
        List<Cliente> clientList = this.clientService.listar();
        model.put("clients", clientList);
        return "Lista_clientes";
    }

    @RequestMapping("/modificar/{id}")
    public String modificar(@PathVariable int id, Model model, RedirectAttributes objRedir) {

        Optional<Cliente> cliente = clientService.listarId(id);

        if (cliente == null) {
            objRedir.addFlashAttribute("mensaje", "Ocurrio un rochesin");
            return "redirect:/credito/listar";
        } else {
            model.addAttribute("credito", cliente.get());
            return "Modificar_Credito";
        }
    }

    @RequestMapping("/guardar")
    public String guardar(@ModelAttribute @Valid Cliente objUser, BindingResult binRes, Model model) throws ParseException {
        Date requestday = new Date();
        objUser.setCreatedDate(requestday);
        ;
        boolean flag = clientService.modificar(objUser);
        if (flag) {
            return "redirect:/cliente/listar";
        } else {
            model.addAttribute("mensaje", "Ocurrio un error");
            return "ModificarCliente";
        }
    }

}
