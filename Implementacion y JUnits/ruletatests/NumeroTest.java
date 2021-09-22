package org.pmoo.ruleta; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumeroTest {

	Apuesta a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37;
	
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
		a1 = new Numero(10000, 1);
		a2 = new Numero(20000, 2);
		
		assertEquals(a1.premio(1), 360000); 
		assertEquals(a2.premio(1), 0);		
		
		assertEquals(a1.premio(2), 0);
		assertEquals(a2.premio(2), 720000); 
	}

	@Test
	public void testNumero() {
		a1 = new Numero(100000, 1);
		a2 = new Numero(1000, 2);
		
		assertNotNull(a1);
		assertNotNull(a2);
	}

}
