package edu.servicios;

import java.util.List;

import edu.Dtos.clienteDto;

public interface FuncionClienteInterfaz {

	public void registroCliente(List<clienteDto> listaClientes);
	
	public void accesoCliente(List<clienteDto> listaClientes);
}
