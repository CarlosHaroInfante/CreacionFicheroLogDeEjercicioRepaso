package edu.servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

import edu.Dtos.clienteDto;

public class FuncionClienteImplementacion implements FuncionClienteInterfaz{
	
	Scanner sc = new Scanner (System.in);
	String ficheroLog = "C:\\Users\\Carlos\\Desktop\\ficheroLog.txt";
	private long idAutogenerado(List<clienteDto> listaClientes) {
		
		long idN;
		int tamanio = listaClientes.size();           
		
		if(tamanio == 0) {
			
			 idN = 1; 
		}
		else {
			
			idN = listaClientes.get(tamanio - 1).getIdCliente() + 1;
			
		}
		
		return idN;
	}
	
	
	@Override
	public void registroCliente(List<clienteDto> listaClientes) {
		
		
		System.out.println("Datos del Cliente");
		
		long id = idAutogenerado(listaClientes);
		System.out.println("Nombre Completo");
		String nombreCompleto = sc.nextLine();
		
		System.out.println("DNI del cliente");
		String dni = sc.next();
		
		System.out.println("email");
		String email = sc.next();
		
		System.out.println("contraseña");
		String contrasenia = sc.next();
		
		Boolean esVal = false;
		
		clienteDto clienteN = new clienteDto(id, dni, nombreCompleto, email, contrasenia, esVal);
		
		listaClientes.add(clienteN);
		
		
		try {
			FileWriter escribe = new FileWriter(ficheroLog);
			
			BufferedWriter leer = new BufferedWriter(escribe);
			
			leer.write("Usuario creado correctamente");
			leer.newLine();
			
			leer.close();
			
			
		}
		catch (Exception e) {
			  System.out.println("Fallo al crear el usuario: " + e.getMessage());
	          e.printStackTrace();
		}
		
	}
	
	public void accesoCliente(List<clienteDto> listaClientes) {
		
		System.out.println("Acceso del Cliente");
		
		
		System.out.println("DNI: ");
		String dniV = sc.next();
		
		System.out.println("Contraseña: ");
		String contraseniaV = sc.next();
		
		
		
		for(clienteDto cliente : listaClientes) {
			
		
		if (cliente.getDniCliente().equals(dniV) & cliente.getContraseniaCliente().equals(contraseniaV)) {
			
			
			
			try {
				FileWriter escribe = new FileWriter(ficheroLog, true);
		
				BufferedWriter leer = new BufferedWriter(escribe);
				
				leer.write("CREDENCIALES CORRECTAS");
				leer.newLine();
				
				leer.close();
				
				
			}
			catch (Exception e) {
				  System.out.println("Fallo en las credenciales: " + e.getMessage());
		          e.printStackTrace();
			}
			
		
			
			if(cliente.getEsValidado() == true) {
				
				try {
					FileWriter escribe = new FileWriter(ficheroLog, true);
					BufferedWriter leer = new BufferedWriter(escribe);
					
					leer.write("INICIO DE SESIÓN CORRECTO");
					leer.newLine();
					
					leer.close();
					
					
				}
				catch (Exception e) {
					  System.out.println("Fallo en el inicio de sesión: " + e.getMessage());
			          e.printStackTrace();
				}
				
				}
				
			}
		
		}
	}
}
		
		
		
		
		
	
	
	


