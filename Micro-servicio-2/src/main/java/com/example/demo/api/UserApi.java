package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Datos;

@RestController
public class UserApi {

	@RequestMapping(value="/product", method=RequestMethod.GET)
	public Datos getById() {
		return new Datos(1, "clave", "Nombre", "User", "apPat", "apMat", "pass", "tipoUsuario");
	}
}
