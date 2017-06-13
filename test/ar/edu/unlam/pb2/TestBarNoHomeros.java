package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TestBarNoHomeros {

	
	// con esto le doy otro criterio de comparacion, tapo el que tengo implementado en la clase Cliente
	private Bar bar;
	
	@Before
	public void init()
	{
		bar = new Bar();
		TreeSet <Cliente> clienteOtro = new TreeSet<Cliente> (new ClientePorEdadComparator());
		bar.setClientes(clienteOtro);
	}
	
	
	@Test
	public void testQueCuentaCantidadDeClientesSeCapturaYTrataLaExcepcion() 
	{
		Bar miBar = new Bar();
		Cliente miCliente1 = new Cliente("Homero", 300d, 30);   
		Cliente miCliente2 = new Cliente("Mario", 200d, 50);
		Cliente miCliente3 = new Cliente("Juan", 100d, 40);
		Cliente miCliente4 = new Cliente("Homero", 50d, 31);  
		miBar.admitirClientes(miCliente1);  //el cliente Homero no se admite
		miBar.admitirClientes(miCliente2);
		miBar.admitirClientes(miCliente3);
		miBar.admitirClientes(miCliente4);  //el cliente Homero no se admite
		assertEquals(miBar.contarCantidadDeClientes(), 2, 0);
	}
	
	
	// activar uno o el otro para probar excepciones
	
//	@Test (expected = Exception.class) 
//	public void testQueCuentaCantidadDeClientesSeLanzaLaExcepcion()  throws Exception
//	{
//		Bar miBar = new Bar();
//		Cliente miCliente1 = new Cliente("Homero", 300d, 30);   
//		Cliente miCliente2 = new Cliente("Mario", 200d, 50);
//		Cliente miCliente3 = new Cliente("Juan", 100d, 40);
//		Cliente miCliente4 = new Cliente("Homero", 50d, 31);  
//		miBar.admitirClientes(miCliente1);  //el cliente Homero no se admite
//		miBar.admitirClientes(miCliente2);
//		miBar.admitirClientes(miCliente3);
//		miBar.admitirClientes(miCliente4);  //el cliente Homero no se admite
//		assertEquals(miBar.contarCantidadDeClientes(), 2, 0);
//	}

}


