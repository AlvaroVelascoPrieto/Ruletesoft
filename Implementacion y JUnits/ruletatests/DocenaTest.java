package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;
import org.pmoo.ruleta.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DocenaTest {

	Apuesta a1;
	Apuesta a2;
	Apuesta a3;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPremio() {
		
		a1 = new Docena(10000, 1);
		a2 = new Docena(2000, 2);
		a3 = new Docena(3214, 3);
	
		assertEquals(a1.premio(1), 30000);
		assertEquals(a2.premio(1), 0);
		assertEquals(a3.premio(1), 0);
		
		assertEquals(a1.premio(15), 0);
		assertEquals(a2.premio(15), 6000);
		assertEquals(a3.premio(15), 0);
		
		assertEquals(a1.premio(30), 0);
		assertEquals(a2.premio(30), 0);
		assertEquals(a3.premio(30), 9642);
	
	
	}

	@Test
	public void testDocena() {
		
		a1 = new Docena(10000, 1);
		a2 = new Docena(2000, 2);
		a3 = new Docena(3214, 3);
		
		assertNotNull(a1);
		assertNotNull(a2);
		assertNotNull(a3);
		
	}

}
