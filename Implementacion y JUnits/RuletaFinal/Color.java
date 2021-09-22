package org.pmoo.ruleta;

public class Color extends Apuesta {
	//Atributos
	
	//Constructora
	public Color(int pValorApuesta, int pCodigoApuesta) {
		super(pValorApuesta, 2, pCodigoApuesta);
	}
	//Métodos
	public int premio(int pNumeroPremiado) {
		int premio = 0;
		if ((pNumeroPremiado == 1||pNumeroPremiado == 3||pNumeroPremiado == 5||pNumeroPremiado == 7 ||pNumeroPremiado == 9
				||pNumeroPremiado == 12||pNumeroPremiado == 14||pNumeroPremiado == 16||pNumeroPremiado == 18||pNumeroPremiado == 19||
						pNumeroPremiado == 21||pNumeroPremiado == 23||pNumeroPremiado == 25||pNumeroPremiado == 27
						||pNumeroPremiado == 30||pNumeroPremiado == 32||pNumeroPremiado == 34||pNumeroPremiado == 36)
						&&this.getCodigo()==1) {    //Rojo
			premio = this.devolverPremio();
		}
		
		else if ((pNumeroPremiado == 2||pNumeroPremiado == 4||pNumeroPremiado == 6||pNumeroPremiado == 8 ||pNumeroPremiado == 10
				||pNumeroPremiado == 11||pNumeroPremiado == 13||pNumeroPremiado == 15||pNumeroPremiado == 17||pNumeroPremiado == 20||
				pNumeroPremiado == 22||pNumeroPremiado == 24||pNumeroPremiado == 26||pNumeroPremiado == 28
				||pNumeroPremiado == 29||pNumeroPremiado == 31||pNumeroPremiado == 33||pNumeroPremiado == 35)
				&&this.getCodigo()==2) {      //Negro
			premio = this.devolverPremio();
		}
		
		else {
			Banca.getBanca().recogerGanancias(this.getValor().valorFichasEnPosesion());
		}
		return premio;
	}
}
