package n2Exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge {

	
	
	public Smartphone(String marca, String model) {
		super(marca, model);
		
	}

	@Override
	public void alarma() {
		
		System.out.println("Esta sonant l'alarma");
	}

	@Override
	public void fotografiar() {
		
		System.out.println("S'esta fent una foto");
	}
	
	

}
