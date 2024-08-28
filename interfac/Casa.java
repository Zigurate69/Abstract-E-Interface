package Aula28_08.interfac;

public class Casa implements Computador {
	
	@Override
	public void ligar() {
		System.out.println("Ligando o Computador de Casa");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("Reiniciando o Computador de Casa");
	}
	
	@Override
	public void desligar() {
		System.out.println("Desligando o Computador de Casa");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("Carregando o Sistema do Computador de Casa");
	}

}
