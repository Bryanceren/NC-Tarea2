package com.uca.capas.ejemplo.controllers;


import java.time.LocalDate;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController2 {
	
	//http://localhost:8079/parametro?dia=17&mes=4&anho=2020
	
	@RequestMapping("/parametro")
	public @ResponseBody String parametro(HttpServletRequest request) {
		Integer param1 = Integer.parseInt(request.getParameter("dia"));
		Integer param2 = Integer.parseInt(request.getParameter("mes"));
		Integer param3 = Integer.parseInt(request.getParameter("anho"));
		
				
		
		LocalDate localDate = LocalDate.of(param3, param2, param1);
	     				
		String dia;
		switch (localDate.getDayOfWeek().getValue()) {
			case 7: dia = "Domingo";
			break;
			case 1: dia = "Lunes";
			break;
			case 2: dia = "Martes";
			break;
			case 3: dia = "Miercoles";
			break;
			case 4: dia = "Jueves";
			break;
			case 5: dia = "Viernes";
			break;
			case 6: dia = "Sabado";
			break;
			default: dia= "Ningun dia seleccionado";
			break;
		}
		
		return "Dia de la semana enviado: " + dia;
	}
}
