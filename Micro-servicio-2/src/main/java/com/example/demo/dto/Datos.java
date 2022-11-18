package com.example.demo.dto;

public class Datos {
	int id;
	public Datos(int id, String clave, String nombre, String username, String apellidoPaterno, String apellidoMaterno,
			String password, String tipo_Usuario) {
		super();
		this.id = id;
		this.clave = clave;
		this.nombre = nombre;
		this.username = username;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.password = password;
		this.tipo_Usuario = tipo_Usuario;
	}
	String clave;
	String nombre;
	String username;
	String apellidoPaterno;
	String apellidoMaterno;
	String password;
	String tipo_Usuario;
}
