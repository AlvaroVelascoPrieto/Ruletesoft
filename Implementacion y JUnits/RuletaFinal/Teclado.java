package org.pmoo.ruleta;


import java.util.InputMismatchException;
import java.util.Scanner;



public class Teclado {
	//Atributos 
	private static Teclado miTeclado;
	private Scanner teclado;
	
	//Constructora
	private Teclado() {
		this.teclado= new Scanner(System.in);
	}
	
	public static Teclado getTeclado() {
		if(Teclado.miTeclado==null) {
			Teclado.miTeclado = new Teclado();
		}
		return Teclado.miTeclado;
	}
	
	public int leerEntero(String pMensajePrevio, int pDesde, int pHasta) {
		int texto = 0;
		boolean correcto = false;
		do {
			try {
			System.out.print(pMensajePrevio);
			texto=teclado.nextInt();
			teclado.nextLine();
			if ((pDesde > texto)||(pHasta< texto)) {
				throw new MiExcepcion();
			}
			correcto = true;
			}
			catch(MiExcepcion e){
				System.out.println("Intervalo invalido.");
			}			catch(InputMismatchException i) {
				System.out.println("Caracter no valido");
				teclado.next();
			}
		}while(!correcto);
		return texto;
	}
	
	public double leerDouble(String pMensajePrevio, double pDesde, double pHasta) {
		double texto = 0.0;
		boolean correcto = false;
		do {
			try {
			System.out.print(pMensajePrevio);
			texto=teclado.nextDouble();
			teclado.nextLine();
			if ((pDesde > texto)||(pHasta< texto)) {
				throw new MiExcepcion();
			}
			correcto = true;
			}
			catch(MiExcepcion e){
				System.out.println("Intervalo invalido.");
			}
			catch(InputMismatchException i) {
				System.out.println("Caracter no valido");
				teclado.next();
			}
		}while(!correcto);
		return texto;
	}

	
	public boolean leerSiNo(String pMensajePrevio) {
		boolean resultado = false;
		boolean correcto = false;
		do {
		try {
		System.out.print(pMensajePrevio);
		String texto = teclado.nextLine();
		if(texto.equalsIgnoreCase("si")) {
			resultado = true;
			correcto = true;
		}
		else if (texto.equalsIgnoreCase("no")) {
			resultado = false;
			correcto = true;
		}
		else {
			throw new MiExcepcion();
		}
		}
		catch(MiExcepcion e) {
			System.out.println("Entrada no valida.");
		}
		}while(!correcto);
		return resultado;
	}
	
	
	public String leerString(String pMensajePrevio) {
		System.out.print(pMensajePrevio);
		String texto=teclado.nextLine();
		return texto;
	}
}
