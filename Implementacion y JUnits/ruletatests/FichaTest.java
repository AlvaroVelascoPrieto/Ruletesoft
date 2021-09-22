package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;
import org.pmoo.ruleta.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FichaTest {

	Ficha f1, f2, f3, f4;
	
	
	
	@Before
	public void setUp() throws Exception {
		
		f3 = new Ficha(500, 50);
		f4 = new Ficha(1000, 100);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFicha() {
		
		Ficha f2;
		
		f1 = new Ficha(100, 10);
		f2 = new Ficha(200, 20);
		
		assertNotNull(f1);
		assertNotNull(f2);

	}

	@Test
	public void testGetValor() {

		assertEquals(f3.getValor(), 500);
		assertEquals(f4.getValor(), 1000);
		
	}

}
