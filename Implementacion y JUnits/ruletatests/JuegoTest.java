package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;


import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JuegoTest {
	
	Juego j1;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		j1 = null;
	}

	@Test
	public void testGetJuego() {
		Juego j2 = Juego.getJuego();
		
		assertNull(j1);
		assertNotNull(j2);
	}

	@Test
	public void testJugar() {
		Juego j2 = Juego.getJuego();
		
		j2.Jugar();
		j2.Jugar();
	}

}
