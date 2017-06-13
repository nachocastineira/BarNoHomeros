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
		
		// CON SET
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
					
//-------------------------------------------------------------------------------------------
			
	// En el bar no se permiten Homeros
	// Recordar tener solo un metodo 'admitirClientes' activo
			
			//Se CAPTURA y  TRATA la excepcion
			
			public void admitirClientes(Cliente cliente) {
				
			if (cliente.getNombre()!="Homero") {
				
				try{								  //CAPTURO
				clientes.add(cliente);
				}
				catch (Exception e) {      //TRATO
					System.out.println("No se admiten Homeros");
				}
			  }		
			else {
					System.out.println("No se admiten Homeros");   //Muestro un mensaje por pantalla
			  }
			}
	
//-------------------------------------------------------------------------------------------			
			
			// Se LANZA la excepcion
			
//			public void admitirClientes(Cliente cliente) throws Exception
//			{
//				if (cliente.getNombre()!="Homero") {
//				clientes.add(cliente);
//				}
//				else
//				{
//					throw new Exception("No se admiten Homeros");   //LANZO
//				}
//			}

//-------------------------------------------------------------------------------------------			
			
			// para poder usar otro criterio de comparacion, sin importar el que tengo en la clase Cliente
			
			public TreeSet<Cliente> getClientes() {
				return clientes;
			}

			public void setClientes(TreeSet<Cliente> clientes) {
				this.clientes = clientes;
			}
					
}
