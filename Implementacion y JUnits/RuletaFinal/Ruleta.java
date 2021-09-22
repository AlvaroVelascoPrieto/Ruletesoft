package org.pmoo.ruleta;
import java.util.Random;



public class Ruleta {
	//Atributos
	private int nNumeros;
	private static Ruleta miRuleta = null;
	//Constructora
	private Ruleta() {
		this.nNumeros = 37;
	}
	//Métodos
	public static Ruleta getRuleta() {
		if (Ruleta.miRuleta==null) {
			Ruleta.miRuleta = new Ruleta();
		}
		return miRuleta;
	}
	
	public int girarRuleta(){
	   Random r = new Random();
	   int tirada = r.nextInt(this.nNumeros);
	   return tirada;
	}
}
