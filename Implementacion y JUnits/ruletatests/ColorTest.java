package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;
import org.pmoo.ruleta.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ColorTest {

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
		
		a1 = new Color(10000, 1);
		a2 = new Color(20000, 2);
		
		assertEquals(a1.premio(1), 20000); 
		assertEquals(a2.premio(1), 0);		  /* Si sale el uno entra dentro de los colores que hemos elegido en la apuesta 1
				                              pero no en la apuesta 2	*/
		
		assertEquals(a1.premio(2), 0);
		assertEquals(a2.premio(2), 40000);    /* De la misma manera, si sale el número 2, que está en el color negro, al cual
		 										 hemos apostado en la apuesta 2, ganremos en esa, pero no en la apuesta 1*/
	}

	@Test
	public void testColor() {
		
		a1 = new Color(100000, 1);
		a2 = new Color(1000, 2);
		
		assertNotNull(a1);
		assertNotNull(a2);
	}

}
