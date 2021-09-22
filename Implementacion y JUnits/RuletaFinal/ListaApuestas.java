package org.pmoo.ruleta;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaApuestas {
	//Atributos
	ArrayList<Apuesta> apuestas;
	
	//Constructora
	public ListaApuestas() {
		this.apuestas = new ArrayList<Apuesta>();
	}
	
	//Métodos
	private Iterator<Apuesta> getIterador(){
		return this.apuestas.iterator();
	}
	
	public int realizarApuestas(int pNumeroDeFichas) {
		int cantidad;
		int apuestaTotal = 0;
		System.out.print("Tines el siguiente numero de fichas:");
		System.out.println(pNumeroDeFichas);
		boolean continuar = Teclado.getTeclado().leerSiNo("¿Quieres apostar a color?");
		while (continuar && pNumeroDeFichas>0) {
			System.out.print("Numeros rojos:" );
			System.out.println("1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36.");
			System.out.print("Numeros negros:" );
			System.out.println("2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35.");
			int color = Teclado.getTeclado().leerEntero("Introduce un 1 para apostar al rojo y un 2 para apostar al negro. ", 1, 2);
			System.out.print("Tines el siguiente numero de fichas:");
			System.out.println(pNumeroDeFichas);
			cantidad = Teclado.getTeclado().leerEntero("Introduce el numero de fichas que deseas apostar.", 1, pNumeroDeFichas);
			pNumeroDeFichas = pNumeroDeFichas - cantidad;
			apuestaTotal = apuestaTotal + cantidad;
			Color nuevaApColor = new Color(cantidad, color);
			this.apuestas.add(nuevaApColor);
			continuar = Teclado.getTeclado().leerSiNo("¿Quieres apostar de nuevo a color?");
		}
		System.out.println("...................................................................");
		continuar = Teclado.getTeclado().leerSiNo("¿Quieres apostar a un Numero?");
		while (continuar && pNumeroDeFichas>0) {
			int numero = Teclado.getTeclado().leerEntero("Introduce el numero al que quieres apostar.(0 a 36) ", 0, 36);
			System.out.print("Tines el siguiente numero de fichas:");
			System.out.println(pNumeroDeFichas);
			cantidad = Teclado.getTeclado().leerEntero("Introduce el numero de fichas que deseas apostar.", 1, pNumeroDeFichas);
			pNumeroDeFichas = pNumeroDeFichas - cantidad;
			apuestaTotal = apuestaTotal + cantidad;
			Numero nuevaApNumero = new Numero(cantidad, numero);
			this.apuestas.add(nuevaApNumero);
			continuar = Teclado.getTeclado().leerSiNo("¿Quieres apostar de nuevo a algun numero?");
		}
		System.out.println("...................................................................");
		continuar = Teclado.getTeclado().leerSiNo("¿Quieres apostar a una Docena?");
		while (continuar && pNumeroDeFichas>0) {
			int docena = Teclado.getTeclado().leerEntero("Introduce un 1 para la primera docena, un 2 para la segunda y un 3 para la tercera.", 1, 3);
			System.out.print("Tines el siguiente numero de fichas:");
			System.out.println(pNumeroDeFichas);
			cantidad = Teclado.getTeclado().leerEntero("Introduce el numero de fichas que deseas apostar.", 1, pNumeroDeFichas);
			pNumeroDeFichas = pNumeroDeFichas - cantidad;
			apuestaTotal = apuestaTotal + cantidad;
			Docena nuevaApDocena = new Docena(cantidad, docena);
			this.apuestas.add(nuevaApDocena);
			continuar = Teclado.getTeclado().leerSiNo("¿Quieres apostar de nuevo a alguna docena?");
		}
		System.out.println("---------------------------------------------------------------");
		continuar = Teclado.getTeclado().leerSiNo("¿Quieres apostar a la paridad?");
		while (continuar && pNumeroDeFichas>0) {
			int paridad = Teclado.getTeclado().leerEntero("Introduce un 1 para apostar a impar y un 2 para apostar a par", 1, 3);
			System.out.print("Tines el siguiente numero de fichas:");
			System.out.println(pNumeroDeFichas);
			cantidad = Teclado.getTeclado().leerEntero("Introduce el numero de fichas que deseas apostar.", 1, pNumeroDeFichas);
			pNumeroDeFichas = pNumeroDeFichas - cantidad;
			apuestaTotal = apuestaTotal + cantidad;
			Paridad nuevaApParidad = new Paridad(cantidad, paridad);
			this.apuestas.add(nuevaApParidad);
			continuar = Teclado.getTeclado().leerSiNo("¿Quieres apostar de nuevo a la paridad?");
		}
		return apuestaTotal;
	}
	
	public int repartirPremios(int pNumeroPremiado) {
		int premioTotal = 0;
		Apuesta actual = null;
		Iterator<Apuesta> itr = this.getIterador();
		while (itr.hasNext()) {
			actual = itr.next();
			premioTotal = actual.premio(pNumeroPremiado);
		}
		return premioTotal;
	}

	public void imprimirApuestas () {
		Apuesta actual = null;
		Iterator<Apuesta> itr = this.getIterador();
		while (itr.hasNext()) {
			actual = itr.next();
			if (actual instanceof Color) {
				if (actual.getCodigo()==1) {
					System.out.print("Has apostado al rojo las siguientes fichas:");
					System.out.println(actual.getValor().valorFichasEnPosesion());
				}
				else {
					System.out.print("Has apostado al negro las siguientes fichas:");
					System.out.println(actual.getValor().valorFichasEnPosesion());
				}
			}
			else if (actual instanceof Numero) {
				System.out.print("Has apostado las siguientes fichas a el numero ");
				System.out.print(actual.getCodigo());
				System.out.print(": ");
				System.out.println(actual.getValor().valorFichasEnPosesion());
				
			}
			else if (actual instanceof Docena) {
				if (actual.getCodigo()==1) {
					System.out.print("Has apostado las siguientes monedas a la primera docena:");
					System.out.println(actual.getValor().valorFichasEnPosesion());
				}
				else if (actual.getCodigo()==2) {
					System.out.print("Has apostado las siguientes monedas a la segunda docena:");
					System.out.println(actual.getValor().valorFichasEnPosesion());
				}
				else if (actual.getCodigo()==3) {
					System.out.print("Has apostado las siguientes monedas a la tercera docena:");
					System.out.println(actual.getValor().valorFichasEnPosesion());
				}
			}
			else if (actual instanceof Paridad) {
				if (actual.getCodigo()==1) {
					System.out.print("Has apostado las siguientes monedas a los numeros impares");
					System.out.println(actual.getValor().valorFichasEnPosesion());
				}
				else if (actual.getCodigo()==2) {
					System.out.print("Has apostado las siguientes monedas a los numeros impares:");
					System.out.println(actual.getValor().valorFichasEnPosesion());
				}
			}
		}
	}
	
	public void resetear() {
		this.apuestas = new ArrayList<Apuesta>();
	}
}
