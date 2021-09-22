package org.pmoo.ruleta;

public class Juego {
	//Atributos
	private static Juego miJuego = null;
	//Constructora
	private Juego() {
		
	}
	//Métodos
	public static Juego getJuego() {
		if (Juego.miJuego==null) {
			Juego.miJuego = new Juego();
		}
		return miJuego;
	}
	
	public void jugar() {
		boolean masJugadores = true;
		boolean continuar = true;
		String nombre;
		double dinero;
		Jugador nuevoJugador;
		int numeroPremiado;
		do {
			while (masJugadores) {
				nombre = Teclado.getTeclado().leerString("Introduce tu nombre:");
				dinero = Teclado.getTeclado().leerDouble("Cuanto dinero tienes en el bolsillo?[Min.:0.1€][Max.:100000€]", 0.1, 100000);
				nuevoJugador = new Jugador(nombre, dinero);
				ListaJugadores.getListaJugadores().anadirJugador(nuevoJugador);
				masJugadores = Teclado.getTeclado().leerSiNo("Hay algun jugador más que quiera registrarse?");
			}
			ListaJugadores.getListaJugadores().comprarFichas();
			ListaJugadores.getListaJugadores().hacerApuestas();
			numeroPremiado = Ruleta.getRuleta().girarRuleta();
			ListaJugadores.getListaJugadores().imprimirApuestas();
			System.out.println("#################################################################");
			System.out.print("El numero premiado ha sido: ");
			System.out.println(numeroPremiado);
			System.out.println("#################################################################");
			ListaJugadores.getListaJugadores().repartirPremios(numeroPremiado);
			ListaJugadores.getListaJugadores().imprimirEstados();
			
			ListaJugadores.getListaJugadores().preguntarSiContinuarJugandoMas();
			continuar = ListaJugadores.getListaJugadores().quedaAlgunJugador();
		}while (continuar);
	}
}
