package n2Exercici1;

/*
Crea una classe anomenada "Telèfon" amb els atributs marca i model, i el mètode trucar(). Aquest mètode ha de 
rebre un String amb un número de telèfon. El mètode ha de mostrar per consola un missatge dient que s’està 
trucant al número rebut per paràmetre. 
*/
public class Telefon {
	private String marca;
	private String model;
	
	
	
	public Telefon(String marca, String model) {
		super();
		this.marca = marca;
		this.model = model;
	}



	public void trucar(String numero) {
		System.out.println("Trucant al número " + numero);
	}
	
}
