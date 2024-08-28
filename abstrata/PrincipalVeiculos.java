package Aula28_08.abstrata;

public class PrincipalVeiculos {

	public static void main(String[] args) {
		
		Onibus cometa = new Onibus();
		Carro ferrari = new Carro();
		
		System.out.println("---------------BUSÃO COMETA---------------");
		cometa.acelerar();
		cometa.freiar();
		cometa.ligar();
		cometa.virar();
		
		System.out.println("---------------CARRO FERRARI---------------");
		ferrari.acelerar();
		ferrari.freiar();
		ferrari.ligar();
		ferrari.virar();
	}
}