
public class Kaiampal extends Raza {

	
	
	public Kaiampal() {
		salud=144;
		rango=10;
		arma="Dientes";
		daņoBasico=29;
	}
	
	@Override
	public void atacar(Raza raza) {

		raza.salud-= daņoBasico* 0.6;
		
	}

	@Override
	public void recibirataque(Raza raza) {

		salud+= salud* 0.1;
		if(efecto==1) {
			activarEfecto(raza);
		}
		
	}

	@Override
	public void descarnsar() {

		efecto=1;

	}

	@Override
	public void activarEfecto(Raza raza) {

		salud-=raza.daņoBasico*0.5;
		
	}

}
