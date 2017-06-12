package ar.edu.unlam.pb2;

import java.util.TreeSet;

public class Bar {
	
			// CON LIST
//		private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
//		
//		
//		public Integer contarCantidadDeClientes()
//		{
//			return clientes.size();
//		}
//		
//		
//		public ArrayList<Cliente> mostrarClientes()
//		{
//			return clientes;
//		}
//		
//		
//		public void admitirClientes(Cliente cliente)
//		{
//			clientes.add(cliente);
//		}
//		
		
		//Se crea coleccion Set
		private TreeSet <Cliente> clientes = new TreeSet<Cliente>();
			
		
				//Metodo para contar los clientes
			public Integer contarCantidadDeClientes()
			{
				return clientes.size();
			}
			
				
				//Metodo para mostrar
			public TreeSet<Cliente> mostrarClientes()
			{
				return clientes;
			}
			
			
				// Para admitir
			public void admitirClientes(Cliente cliente)
			{
				clientes.add(cliente);
			}



			// para poder usar otro criterio de comparacion, sin importar el que tengo en la clase Cliente
			
			public TreeSet<Cliente> getClientes() {
				return clientes;
			}

			public void setClientes(TreeSet<Cliente> clientes) {
				this.clientes = clientes;
			}
					
}
