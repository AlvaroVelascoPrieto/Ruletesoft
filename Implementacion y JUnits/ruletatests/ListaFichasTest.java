package org.pmoo.ruletatests; 
import org.pmoo.ruleta.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaFichasTest {

	Ficha f1;
	Ficha f2;
	Ficha f3;
	ListaFichas lf1;
	
	@Before
	public void setUp() throws Exception {
		f1 = new Ficha(1,2);
		f2 = new Ficha(3, 5);
		f3 = new Ficha(8, 1);
		lf1 = new ListaFichas();

		lf1.incrementarFichas(f1.getValor());
		lf1.incrementarFichas(f2.getValor());
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testIncrementarFichas() {
		lf1.incrementarFichas(f3.getValor());
		assertEquals(lf1.valorFichasEnPosesion(), f1.getValor() + f2.getValor() + f3.getValor());
	}

	@Test
	public void testDecrementarFichas() {
		lf1.decrementarFichas(f1.getValor());
		
		assertEquals(lf1.valorFichasEnPosesion(), f2.getValor());
	}

	@Test
	public void testValorFichasEnPosesion() {
		lf1.incrementarFichas(f3.getValor());
		assertEquals(lf1.valorFichasEnPosesion(), f1.getValor() + f2.getValor() + f3.getValor());
	}

	@Test
	public void testImprimirFichas() {
		lf1.imprimirFichas();
	}

}
