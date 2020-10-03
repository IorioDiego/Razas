
public abstract class Raza {
	
	protected int salud;
	protected int dañoBasico;
	protected String arma;
	protected int rango;
	int veneno=0;
	
	
	
	public  abstract void atacar(Raza raza);
	public abstract void recibirataque(Raza raza);
	public abstract void descarnsar();
	public abstract void activarEfecto(Raza raza);
	

	
}
