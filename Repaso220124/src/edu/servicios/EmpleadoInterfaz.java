package edu.servicios;

import java.util.List;

import edu.Dtos.clienteDto;

public interface EmpleadoInterfaz {

	public void mostrarClientes(List<clienteDto> listaClientes);
	
	public void validarClientes(List<clienteDto> listaClientes);
	
	public void borrarClientes(List<clienteDto> listaClientes);
}
