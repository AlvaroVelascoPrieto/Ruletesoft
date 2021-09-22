package org.pmoo.ruleta;

public class Banca {
	//Atributos
	private ListaFichas fichas;
	private double dinero;
	private static Banca miBanca;
	//Constructora
	private Banca() {
		this.fichas = new ListaFichas();
		this.fichas.incrementarFichas(100000000);  //Asumimos que en el inicio la banca tendra fichas por valor de 10 millones de euros.
		this.dinero = 0;
	}
	//Métodos
	public static Banca getBanca(){
		if (Banca.miBanca==null) {
			Banca.miBanca = new Banca();
		}
		return miBanca;
	}
	
	public void venderFichas(int pValorFichas) {
		this.fichas.decrementarFichas(pValorFichas);
		this.dinero = this.dinero + (pValorFichas / 10);
	}
	
	public double canjearFichas(int pValorFichas) {
		this.fichas.incrementarFichas(pValorFichas);
		double dineroADevolver = pValorFichas/10.0;
		this.dinero = this.dinero - dineroADevolver;
		return dineroADevolver;
	}
	
	public void recogerGanancias(int pValorEnFichas) {
		this.fichas.incrementarFichas(pValorEnFichas);
	}
}
