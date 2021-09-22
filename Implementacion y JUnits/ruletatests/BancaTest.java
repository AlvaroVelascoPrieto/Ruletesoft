package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;


import org.pmoo.ruleta.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BancaTest {
	
	Banca b1 = Banca.getBanca();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	b1 = null;
	}

	@Test
	public void testGetBanca() {
	
	Banca b2 = Banca.getBanca();
	
	assertNotNull(b1);
	assertNotNull(b2);
	
	}

	@Test
	public void testVenderFichas() {
		
		b1.venderFichas(1000); /* No hay realmente un método de ver si el código ha funcionado 
								  por lo que se comprobará en el resto de clases que requieran 
								  el uso de este método */
		
	}

	@Test
	public void testCanjearFichas() {
		b1.canjearFichas(1000);
		
		assertEquals(b1.canjearFichas(1000), 100, 0); //Comprobamos que devuelve el dinero equivalente a las fichas que le hemos dado
	}

	@Test
	public void testRecogerGanancias() {
		b1.recogerGanancias(1000);
	}

}
