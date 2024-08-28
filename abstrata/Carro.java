package Aula28_08.abstrata;

public class Carro extends Veiculos {
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando");
	}
	
	@Override
	public void freiar() {
		System.out.println("Freiando");
	}
	
	@Override
	public void virar() {
		System.out.println("Virando");
	}
	
	@Override
	public void ligar() {
		System.out.println("Ligando");
	}
}