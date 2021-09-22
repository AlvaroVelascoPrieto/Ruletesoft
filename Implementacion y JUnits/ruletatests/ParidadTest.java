package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ParidadTest {

	Apuesta a1;
	Apuesta a2;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		a1 = null;
		a2 = null;
	}

	@Test
	public void testPremio() {
		
		a1 = new Paridad(1000, 1);
		a2 = new Paridad(2000, 2);
		
		assertEquals(a1.premio(1), 3000); 
		assertEquals(a2.premio(1), 0);	
		
		
		assertEquals(a1.premio(2), 0);
		assertEquals(a2.premio(2), 6000);
	}

	@Test
	public void testParidad() {
		a1 = new Paridad(100000, 1);
		a2 = new Paridad(1000, 2);
		
		assertNotNull(a1);
		assertNotNull(a2);
	}

}
