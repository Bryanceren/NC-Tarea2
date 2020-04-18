package com.uca.capas.ejemplo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/usuario")
	public @ResponseBody String ejemplo( ) {
		String nombre = "Nombre: Bryan Francisco";
		String apellido = "Apellido: Ceren Brito";
		String carnet = "Carnet: 00139817";
		String carrera =  "Carrera: Ingenieria Informatica";
		String ano = "Año: 4";
		String datos = nombre + "<br>" + apellido + "<br>" + carnet + "<br>" + carrera + "<br>" + ano;  
		return datos.toString();
	}
	
}
