
public abstract class Raza {
	
	protected int salud;
	protected int da�oBasico;
	protected String arma;
	protected int rango;
	int veneno=0;
	
	
	
	public  abstract void atacar(Raza raza);
	public abstract void recibirataque(Raza raza);
	public abstract void descarnsar();
	public abstract void activarEfecto(Raza raza);
	

	
}
