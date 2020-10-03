
public abstract class Raza {
	
	protected int salud;
	protected int dañoBasico;
	protected String arma;
	protected int rango;
	int efecto=0;
	boolean estado=false;
	
	
	
	public  abstract void atacar(Raza raza);
	public abstract void recibirataque(Raza raza);
	public abstract void descarnsar();
	public abstract void activarEfecto(Raza raza);
	

	
}
