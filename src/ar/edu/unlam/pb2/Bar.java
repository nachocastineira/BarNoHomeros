package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Bar {
	
		private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		
		public Integer contarCantidadDeClientes()
		{
			return clientes.size();
		}
		
		
		public ArrayList<Cliente> mostrarClientes()
		{
			return clientes;
		}
		
		
		public void admitirClientes(Cliente cliente)
		{
			clientes.add(cliente);
		}
				
				
}
