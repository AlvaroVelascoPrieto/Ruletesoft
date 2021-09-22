package org.pmoo.ruleta;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaJugadores {
	//Atributos
	private ArrayList<Jugador> Lista;
	private static ListaJugadores miLista;
	
	//Constructora
	private ListaJugadores() {
		this.Lista = new ArrayList<Jugador>();
	}
	//Métodos
	public static ListaJugadores getListaJugadores() {
		if(ListaJugadores.miLista==null) {
			ListaJugadores.miLista = new ListaJugadores();
		}
		return miLista;
	}
	
	private Iterator<Jugador> getIterador(){
		return ListaJugadores.getListaJugadores().Lista.iterator();
	}
	
	public void hacerApuestas() {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		while(itr.hasNext()) {
			actual = itr.next();
			actual.hacerApuesta();
		}
	}
	
	public void comprarFichas() {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		while(itr.hasNext()) {
			actual = itr.next();
			System.out.println(actual.getNombre());
			actual.comprarFichas();
		}
	}
	
	public void imprimirEstados() {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		while(itr.hasNext()) {
			actual = itr.next();
			actual.imprimirEstado();
		}
	}
	
	public void imprimirApuestas() {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		while(itr.hasNext()) {
			actual = itr.next();
			actual.imprimirApuestas();
		}
	}
	
	public void repartirPremios(int pNumeroPremiado) {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		while(itr.hasNext()) {
			actual = itr.next();
			actual.recogerPremio(pNumeroPremiado);
		}
	}
	
	public void preguntarSiContinuarJugandoMas() {
		Iterator<Jugador> itr = this.getIterador();
		Jugador actual = null;
		boolean jugar;
		while(itr.hasNext()) {
			actual = itr.next();
			System.out.println(actual.getNombre());
			jugar = Teclado.getTeclado().leerSiNo("Quieres seguir jugando mas?");
			if (!jugar) {
				actual.canjearFichas();
				this.Lista.remove(actual);
			}
		}
	}
	
	public void anadirJugador(Jugador pNuevoJugador) {
		this.Lista.add(pNuevoJugador);
	}
	
	public boolean quedaAlgunJugador() {
		boolean queda = false;
		if (this.Lista.size()>0) {
			queda = true;
		}
		return queda;
	}
	
}
