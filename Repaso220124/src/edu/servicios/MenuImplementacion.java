package edu.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	Scanner sc = new Scanner (System.in);
	
	public int opcion(){
		
		
		
		
		System.out.println("Tipo de Usuario");
		
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Versión Empleado");
		System.out.println("[2] - Vesión Cliente");
		
		int op = sc.nextInt();
		
		
		return op;

		
	}
	
	public int opcionEmpleado() {
		
		System.out.println("Versión Empleado");
		
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Validar Cliente");
		System.out.println("[2] - Borrar Cliente");
		System.out.println("[3] - Mostrar Cliente");
		
		int opEmpleado = sc.nextInt();
		
		
		return opEmpleado;
	}
	
	public int opcionCliente() {
		
		System.out.println("Versión Cliente");
		
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Registro Cliente");
		System.out.println("[2] - Acceso Cliente (login)");
		
		
		int opCliente = sc.nextInt();
		
		
		return opCliente;
	}
}
