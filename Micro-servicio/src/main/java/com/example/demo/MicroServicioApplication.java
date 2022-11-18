package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MicroServicioApplication {

	public static void main(String[] args) throws IOException {
		
		String infoGuardar = "";
		Scanner entradaTxt;
	    File leeArchivo;
	    String a;
	    String guardadoLinea;
	    ArrayList<Usuario> lista = new ArrayList<>();
	    
	    try
	    {
	        entradaTxt = new Scanner("C:/Users/samue/Documents/workspace-spring-tool-suite-4-4.16.1.RELEASE/Micro-servicio/src/main/java/datos/usuarios.txt");
	        a = entradaTxt.nextLine();
	        leeArchivo = new File(a);
	        entradaTxt = new Scanner(leeArchivo);
	        
	        int comienzo = 0;
	        while(entradaTxt.hasNextLine() && comienzo < 100)
	        {

	            guardadoLinea = entradaTxt.nextLine();
	            System.out.println(guardadoLinea);
	            infoGuardar += guardadoLinea;
	            comienzo++;
	        }
	        
	        String array1[] = infoGuardar.split(";");
			for (int i = 0; i < array1.length; i++) {
				String x =  array1[i];
				String array2[] = x.split("\\|");
				
				Usuario user = new Usuario();
				user.id = Integer.parseInt(array2[0]);
				user.clave = array2[1];
				user.sexo = array2[2];
				user.username = array2[3];
				user.nombre = array2[4];
				user.apellidoPaterno = array2[5];
				user.apellidoMaterno = array2[6];
				user.password = array2[7];
				user.tipoUsuario = array2[8];
				
				lista.add(user);
			}
			
			for (Usuario usuario : lista) {
				System.out.println("Id: " + usuario.id + ", Clave de usuario: " + usuario.clave +
						          ", Sexo: "+ usuario.sexo + ", Usuario: " + usuario.username + 
						          ", Nombre: " + usuario.nombre + ", apellido paterno: " + usuario.apellidoPaterno + 
						          ", apellido materno: "+ usuario.apellidoMaterno + ", Tpo de usuario:" + usuario.tipoUsuario);
			}
	        

	    }
	    catch(Exception e)
	    {
	        System.out.println(e.getMessage());
	    }
		
	}

}
