package org.pmoo.ruleta;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaFichas {
	//Atributos
	ArrayList <Ficha> fichas;
	
	//Constructora
	public ListaFichas() {
		this.fichas = new ArrayList<Ficha>();
	}
	
	//Métodos
	private Iterator<Ficha> getIterador(){
		return this.fichas.iterator();
	}
	
	public void incrementarFichas(int pValorDeFichas) {
		Ficha nuevaFicha = null;
		while (pValorDeFichas > 0) {
			if (pValorDeFichas > 50) {
				nuevaFicha = new Ficha(50);
				this.fichas.add(nuevaFicha);
				pValorDeFichas = pValorDeFichas - 50;
			}
			else if (pValorDeFichas > 25) {
				nuevaFicha = new Ficha(25);
				this.fichas.add(nuevaFicha);
				pValorDeFichas = pValorDeFichas - 25;
			}
			else if (pValorDeFichas > 20) {
				nuevaFicha = new Ficha(20);
				this.fichas.add(nuevaFicha);
				pValorDeFichas = pValorDeFichas - 20;
			}
			else if (pValorDeFichas > 10) {
				nuevaFicha = new Ficha(10);
				this.fichas.add(nuevaFicha);
				pValorDeFichas = pValorDeFichas - 10;
			}
			else if (pValorDeFichas > 5) {
				nuevaFicha = new Ficha(5);
				this.fichas.add(nuevaFicha);
				pValorDeFichas = pValorDeFichas - 5;
			}
			else if (pValorDeFichas > 2) {
				nuevaFicha = new Ficha(2);
				this.fichas.add(nuevaFicha);
				pValorDeFichas = pValorDeFichas - 2;
			}
			else if (pValorDeFichas >= 1) {
				nuevaFicha = new Ficha(1);
				this.fichas.add(nuevaFicha);
				pValorDeFichas = pValorDeFichas- 1;
			}
		}
	}
	
	public void decrementarFichas(int pValorDeFichas) {
		int valorActual = this.valorFichasEnPosesion();
		int nuevoValorFichas = valorActual - pValorDeFichas;
		this.resetear();
		this.incrementarFichas(nuevoValorFichas);
	}
	
	public int valorFichasEnPosesion() {
		int valorTotal = 0;
		Ficha actual = null;
		Iterator<Ficha> itr = this.getIterador();
		while (itr.hasNext()) {
			actual = itr.next();
			valorTotal = valorTotal + actual.getValor();
		}
		return valorTotal;
	}
	
	public void imprimirFichas() {
		System.out.print("Tienes el siguiente numero de fichas:");
		System.out.println(this.valorFichasEnPosesion());
	}
	
	public void resetear() {
		this.fichas = new ArrayList<Ficha>();
	}

}
