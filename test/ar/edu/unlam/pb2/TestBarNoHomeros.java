package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBarNoHomeros {

	@Test
	public void testQueCuentaCantidadDeClientes() 
	{
		Bar miBar = new Bar();
		Cliente miCliente1 = new Cliente("Pedro", 300d);
		Cliente miCliente2 = new Cliente("Homero", 300d);
		miBar.admitirClientes(miCliente1);
		miBar.admitirClientes(miCliente2);
		assertEquals(miBar.contarCantidadDeClientes(), 2, 0);
	}

}
