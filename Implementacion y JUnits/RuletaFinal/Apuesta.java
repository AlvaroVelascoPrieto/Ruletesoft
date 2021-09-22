package org.pmoo.ruleta;

public abstract class Apuesta {
	//Atributos
	private ListaFichas valor;
	private int multiplicador;
	private int codigo;
	//Constructora
	public Apuesta (int pValorApuesta, int pMultiplicador, int pCodigoApuesta) {
		this.valor = new ListaFichas();
		this.valor.incrementarFichas(pValorApuesta);
		this.multiplicador = pMultiplicador;
		this.codigo = pCodigoApuesta;
	}
	//Métodos
	public int devolverPremio() {
		int premio = this.valor.valorFichasEnPosesion() * this.multiplicador;
		return premio;
	}
	
	public abstract int premio(int pNumeroPremiado);
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public ListaFichas getValor() {
		return this.valor;
	}
}
