package com.collection.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.collection.model.*;


@Controller
public class CollectionController {

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
	public ModelAndView ingresarUsuario(@ModelAttribute Usuario Usuario, 
			   ModelMap model) {
		if(Usuario.getUsuario().equals("progra2")&&Usuario.getPassword().equals("12345")){
			
			return new ModelAndView("index2");
		}else{
			model.addAttribute("usuario", Usuario);
			return new ModelAndView("Login","command",new Usuario());
		}
	
	}
		
	@RequestMapping(value = "/addCliente", method = RequestMethod.POST)
	public String addCliente(@ModelAttribute Cliente cliente, 
			   ModelMap model) {
		model.addAttribute("cliente", cliente);
		return "resultado";

	}
	
	@RequestMapping(value = "/addProducto", method = RequestMethod.POST)
	public String addProducto(@ModelAttribute Producto producto, 
			   ModelMap model) {
		model.addAttribute("producto", producto);
		return "resultado2";

	}

	
}
