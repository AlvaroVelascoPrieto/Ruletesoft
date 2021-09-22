package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RuletaTest {

	Ruleta r1 = Ruleta.getRuleta();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		r1 = null;
	}

	@Test
	public void testGetRuleta() {
		Ruleta r2 = Ruleta.getRuleta();
		
		assertNotNull(r1);
		assertNotNull(r2);
	}

	@Test
	public void testGirarRuleta() {
		assertTrue(r1.girarRuleta()>0 && r1.girarRuleta()<38);
	}

}
