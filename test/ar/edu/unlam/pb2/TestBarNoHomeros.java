package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TestBarNoHomeros {

//	@Test
//	public void testQueCuentaCantidadDeClientes() 
//	{
//		Bar miBar = new Bar();
//		Cliente miCliente1 = new Cliente("Pedro", 300d);
//		Cliente miCliente2 = new Cliente("Homero", 300d);
//		miBar.admitirClientes(miCliente1);
//		miBar.admitirClientes(miCliente2);
//		assertEquals(miBar.contarCantidadDeClientes(), 2, 0);
//	}
	
	
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
	public void testQueCuentaCantidadDeClientes() 
	{
		Bar miBar = new Bar();
		Cliente miCliente1 = new Cliente("Homero", 300d, 30);
		Cliente miCliente2 = new Cliente("Homero", 300d, 30);
		miBar.admitirClientes(miCliente1);
		miBar.admitirClientes(miCliente2);
		assertEquals(miBar.contarCantidadDeClientes(), 1, 0);

	}
}


