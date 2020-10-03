
public class Bruchian extends Raza {
	
	public Bruchian() {
		this.salud=180;
		this.rango=15;
		this.dañoBasico= 124;
		this.arma = "Manos";
	}

	@Override
	public void atacar(Raza raza) {
		
	}

	@Override
	public void recibiratque(Raza raza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descarnsar() {
		double saludRecu= 180 * 0.33;
		if(saludRecu + this.salud > 180)
			salud=180;
		else
			salud+=saludRecu;
	}
	
	

}
