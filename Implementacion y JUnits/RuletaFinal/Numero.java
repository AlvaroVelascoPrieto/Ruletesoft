package org.pmoo.ruleta;

public class Numero extends Apuesta {
	//Atributos
	
	//Constructora
	public Numero(int pValorApuesta, int pCodigoApuesta) {
		super(pValorApuesta, 36, pCodigoApuesta);
	}
	//Métodos
	public int premio(int pNumeroPremiado) {
		int premio = 0;
		if (pNumeroPremiado == this.getCodigo()) {
			premio = this.devolverPremio();
		}
		
		else {
			Banca.getBanca().recogerGanancias(this.getValor().valorFichasEnPosesion());
		}
		return premio;
	}
}
