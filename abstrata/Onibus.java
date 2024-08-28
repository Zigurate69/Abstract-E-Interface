package Aula28_08.abstrata;

public class Onibus extends Veiculos {
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando o Onibus");
	}
	
	@Override
	public void freiar() {
		System.out.println("Freiando o Onibus");
	}
	
	@Override
	public void virar() {
		System.out.println("Virando o Onibus");
	}
	
	@Override
	public void ligar() {
		System.out.println("Ligando o Onibus");
	}
}