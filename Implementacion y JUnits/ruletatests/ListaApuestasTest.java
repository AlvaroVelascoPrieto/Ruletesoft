package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaApuestasTest {

	Apuesta a1;
	Apuesta a2;
	Apuesta a3;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		a1 = null;
		a2 = null;
		a3 = null;
	}

	@Test
	public void testListaApuestas() {
		ListaApuestas l1 = new ListaApuestas();
		
		assertNotNull(l1);
	}

	@Test
	public void testRealizarApuestas() {
		ListaApuestas l1 = new ListaApuestas();
		//para este test usaremos un método implementado excepcionalmente ya que no tenemos aquí el input del usuario
		a1 = new Color(100, 1);
		l1.anadirApuesta(a1);
		
		l1.realizarApuestas(100); //Apostamos con supuestas 100 fichas que poseería un jugador y que usaría en Color
		
		assertEquals(a1.premio(1), 200);
	}

	@Test
	public void testRepartirPremios() {
		ListaApuestas l1 = new ListaApuestas();
		a1 = new Color(100, 1);
		a2 = new Color(200, 2);
		
		l1.anadirApuesta(a1);
		l1.anadirApuesta(a2);
		
		l1.repartirPremios(1);
		
		
	}

	@Test
	public void testImprimirApuestas() {
		ListaApuestas l1 = new ListaApuestas();
		l1.imprimirApuestas();
		
		assertTrue(true);
	}

	@Test
	public void testResetear() {
		ListaApuestas l1 = new ListaApuestas();
		
		a1 = new Paridad(100, 1);
		
		l1.resetear();
		
		assertEquals(l1.getApuestas(), null);
	}

}
