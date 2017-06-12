package ar.edu.unlam.pb2;

import java.util.Comparator;

public class ClientePorEdadComparator implements Comparator<Cliente>{

	
	@Override
	public int compare(Cliente uno, Cliente otro) {
		
		if (uno.getEdad()>otro.getEdad())
		{
			return 1; 
		}
		
		else if (uno.getEdad()<otro.getEdad())
		{
			return -1;
		}
		
		else
		{
			return 0;
		}
			
	}
	
	

}
