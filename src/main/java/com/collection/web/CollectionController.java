package com.collection.web;

<<<<<<< HEAD
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
=======
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
>>>>>>> 7445760a6ed9e44ffc484719bc9a61d6653ae46f
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.collection.model.*;


@Controller
public class CollectionController {

<<<<<<< HEAD
	@ModelAttribute("usuario")
	public Usuario getLoginForm() {
		return new Usuario();
	}	
	
	
=======
>>>>>>> 7445760a6ed9e44ffc484719bc9a61d6653ae46f
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("Login","command",new Usuario());
	}
	
	@RequestMapping(value = "/RegistrarCliente", method = RequestMethod.GET)
	public ModelAndView cliente() {
		return new ModelAndView("RegistrarCliente","command",new Cliente());
	}
	
	@RequestMapping(value = "/RegistrarProducto", method = RequestMethod.GET)
	public ModelAndView producto() {
		return new ModelAndView("RegistrarProducto","command",new Producto());
	}
	
	@RequestMapping(value = "/ActualizarStock", method = RequestMethod.GET)
	public ModelAndView productoaCtualizar() {
		return new ModelAndView("ActualizarStock","command",new Producto());
	}

	@RequestMapping(value = "/ingresarUsuario", method = RequestMethod.POST)
<<<<<<< HEAD
	public ModelAndView ingresarUsuario(@ModelAttribute("usuario")  @Valid Usuario usuario, 
			   BindingResult result,Map model) {
		System.out.println("holi toy aca0");
		if(result.hasErrors()){
			System.out.println("holi toy aca");
			return new ModelAndView("Login","command",new Usuario());
		}
		if(usuario.getUsuario().equals("progra2")&&usuario.getPassword().equals("12345")){
			model.put("usuario", usuario);
			return new ModelAndView("index2");
		}else{

=======
	public ModelAndView ingresarUsuario(@ModelAttribute Usuario Usuario, 
			   ModelMap model) {
		if(Usuario.getUsuario().equals("progra2")&&Usuario.getPassword().equals("12345")){
			
			return new ModelAndView("index2");
		}else{
			model.addAttribute("usuario", Usuario);
>>>>>>> 7445760a6ed9e44ffc484719bc9a61d6653ae46f
			return new ModelAndView("Login","command",new Usuario());
		}
	
	}
		
	@RequestMapping(value = "/addCliente", method = RequestMethod.POST)
<<<<<<< HEAD
	public String addCliente(@ModelAttribute("Cliente") @Valid Cliente cliente, 
			  BindingResult result,Map model) {
		if(result.hasErrors()){
			return "RegistrarCliente";
		}
		
		model.put("cliente", cliente);
=======
	public String addCliente(@ModelAttribute Cliente cliente, 
			   ModelMap model) {
		model.addAttribute("cliente", cliente);
>>>>>>> 7445760a6ed9e44ffc484719bc9a61d6653ae46f
		return "resultado";

	}
	
	@RequestMapping(value = "/addProducto", method = RequestMethod.POST)
	public String addProducto(@ModelAttribute Producto producto, 
			   ModelMap model) {
		model.addAttribute("producto", producto);
		return "resultado2";

	}

	
}
