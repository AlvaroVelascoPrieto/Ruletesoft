package org.pmoo.ruleta;

public class Docena extends Apuesta{
	//Atributos
	
	//Constructora
	public Docena(int pValorApuesta, int pCodigoApuesta) {
		super(pValorApuesta, 3, pCodigoApuesta);
	}
	//Métodos
	public int premio(int pNumeroPremiado) {
		int premio = 0;
		if (pNumeroPremiado<=12 && pNumeroPremiado>0 && this.getCodigo()==1) {  //Primera
			premio = this.devolverPremio();
		}
		else if (pNumeroPremiado<=24 && pNumeroPremiado>=13 && this.getCodigo()==2) {  //Segunda
			premio = this.devolverPremio();
		}
		else if (pNumeroPremiado<=36 && pNumeroPremiado>=25 && this.getCodigo()==3) {   //Tercera
			premio = this.devolverPremio();
		}
		else {
			Banca.getBanca().recogerGanancias(this.getValor().valorFichasEnPosesion());
		}
		return premio;
	}
}
