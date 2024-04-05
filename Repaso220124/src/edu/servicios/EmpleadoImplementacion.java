package edu.servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

import edu.Dtos.clienteDto;

public class EmpleadoImplementacion implements EmpleadoInterfaz{

	String ficheroLog = "C:\\Users\\Carlos\\Desktop\\ficheroLog.txt";
	Scanner sc = new Scanner (System.in);
	public void mostrarClientes(List<clienteDto> listaClientes) {
		
		
		
		for(clienteDto cliente : listaClientes) {
			
			if(listaClientes.size() <= 0) {
				
					
					try {
						FileWriter escribe = new FileWriter(ficheroLog, true);
						BufferedWriter leer = new BufferedWriter(escribe);
						
						leer.write("No contiene ningún cliente");
						leer.newLine();
						
						leer.close();
						
						
					}
					catch (Exception e) {
						  System.out.println("Fallo en la listaClientes: " + e.getMessage());
				          e.printStackTrace();
					}
				
			}
			
			else {
				
				try {
					FileWriter escribe = new FileWriter(ficheroLog, true);
					BufferedWriter leer = new BufferedWriter(escribe);
					
					leer.write("DNI: " + cliente.getDniCliente() + " Nombre Completo: " + cliente.getNombreCompletoCliente() + " Estado de validación: " + cliente.getEsValidado());
					leer.newLine();
					
					leer.close();
					
					
				}
				catch (Exception e) {
					  System.out.println("Fallo en el registro de usuarios: " + e.getMessage());
			          e.printStackTrace();
				}
				
				
				
			}
			
		}
		
		
		
		
	}
	
	public void validarClientes(List<clienteDto> listaClientes) {
		
		System.out.println("Validar Clientes");
		
		for(clienteDto cliente : listaClientes) {
			
			if(cliente.getEsValidado() == false) {
				
				System.out.println("/////////////////");
				System.out.println(" DNI: " + cliente.getDniCliente());
				System.out.println(" Nombre: " + cliente.getNombreCompletoCliente());
				System.out.println("/////////////////");
				
				
				System.out.println("DNI del cliente que quiere validar");
				String dniCV = sc.next();
				
				if(cliente.getDniCliente().equals(dniCV)) {
					
					Boolean valido = true;
					cliente.setEsValidado(valido);
					System.out.println();
					
					try {
						FileWriter escribe = new FileWriter(ficheroLog, true);
						BufferedWriter leer = new BufferedWriter(escribe);
						
						leer.write("El cliente " + cliente.getNombreCompletoCliente() + "ha sido validado correctamente.");
						leer.newLine();
						
						leer.close();
						
						
					}
					catch (Exception e) {
						  System.out.println("Fallo al validar al usuario: " + e.getMessage());
				          e.printStackTrace();
					}
					
				}
				
				else {
					
					try {
						FileWriter escribe = new FileWriter(ficheroLog, true);
						BufferedWriter leer = new BufferedWriter(escribe);
						
						leer.write("Ningún cliente tiene ese DNI o esta ya validado.");
						leer.newLine();
						
						leer.close();
						
						
					}
					catch (Exception e) {
						  System.out.println("Ningun usuario tiene ese DNI registrado " + e.getMessage());
				          e.printStackTrace();
					}
				}
			}
			
		}
	}
	
	public void borrarClientes(List<clienteDto> listaClientes) {
		
		System.out.println("Eliminar clientes");
		
		mostrarClientes(listaClientes);
		
		System.out.println("Dame el dni del cliente que desea borrar: ");
		String dniCE = sc.next();
		
		clienteDto clienteBorrado = new clienteDto();
		
		for(clienteDto cliente : listaClientes) {
			
			if(cliente.getDniCliente().equals(dniCE)) {
				
				clienteBorrado = cliente;
				
				try {
					FileWriter escribe = new FileWriter(ficheroLog, true);
					BufferedWriter leer = new BufferedWriter(escribe);
					
					leer.write("El cliente con nombre " + clienteBorrado.getNombreCompletoCliente() + " con dni " + clienteBorrado.getDniCliente() + " se elimina");
					leer.newLine();
					
					leer.close();
					
					
				}
				catch (Exception e) {
					  System.out.println("Error al eliminar el cliente " + e.getMessage());
			          e.printStackTrace();
				}
				
				
			}
			else {
				
				try {
					FileWriter escribe = new FileWriter(ficheroLog, true);
					BufferedWriter leer = new BufferedWriter(escribe);
					
					leer.write("Ningún cliente coincide con el dni adjunto para borrarlo");
					leer.newLine();
					
					leer.close();
					
					
				}
				catch (Exception e) {
					  System.out.println("Error el dni no coincide en el registro " + e.getMessage());
			          e.printStackTrace();
				}
				
			}
			
		}
		
		listaClientes.remove(clienteBorrado);
		
	}
}
