package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaJugadoresTest {

	Jugador j1;
	Jugador j2;
	Jugador j3;
	ListaJugadores lj1;
	
	@Before
	public void setUp() throws Exception {
		
		j1 = new Jugador("Alberto", 1000);
		j2 = new Jugador("David", 13000);
		j3 = new Jugador("Alvaro", 20000);
		lj1 = ListaJugadores.getListaJugadores();
	
		
	}

	@After
	public void tearDown() throws Exception {
		j1 = null;
		j2 = null;
		j3 = null;
		lj1 = null;
	}

	@Test
	public void testGetListaJugadores() {
		assertNotNull(lj1);
	}

	@Test
	public void testHacerApuestas() {
		lj1.anadirJugador(j1);
		lj1.anadirJugador(j2);
		lj1.anadirJugador(j3);
		lj1.hacerApuestas();
		
		
	}

	@Test
	public void testComprarFichas() {
		lj1.anadirJugador(j1);
		lj1.anadirJugador(j2);
		lj1.anadirJugador(j3);
		lj1.comprarFichas();
	}

	@Test
	public void testImprimirEstados() {
		lj1.anadirJugador(j1);
		lj1.anadirJugador(j2);
		lj1.anadirJugador(j3);
		lj1.imprimirEstados();
	}

	@Test
	public void testImprimirApuestas() {	
		lj1.anadirJugador(j1);
		lj1.anadirJugador(j2);
		lj1.anadirJugador(j3);
		lj1.imprimirApuestas();
	}

	@Test
	public void testRepartirPremios() {
		lj1.anadirJugador(j1);
		lj1.anadirJugador(j2);
		lj1.anadirJugador(j3);
		
		Apuesta a1;
		a1 = new Color(100, 1); //Simulamos que el jugador ha introducido cómo quiere la apuesta
	
		lj1.repartirPremios(11);//Con el código 1 y un número impar ganaríamos
		j1.recogerPremio(11);
		
	}

	@Test
	public void testPreguntarSiContinuarJugandoMas() {
		lj1.anadirJugador(j1);
		lj1.anadirJugador(j2);
		lj1.anadirJugador(j3);
		lj1.preguntarSiContinuarJugandoMas();
	}

	@Test
	public void testAnadirJugador() {
		lj1.anadirJugador(j1);
		lj1.anadirJugador(j2);
		lj1.anadirJugador(j3);
		
		assertNotNull(lj1.getListaJugadores());
	}

	@Test
	public void testQuedaAlgunJugador() {
		assertFalse(lj1.quedaAlgunJugador());
		
		lj1.anadirJugador(j1);
		
		assertTrue(lj1.quedaAlgunJugador());
	}

}
