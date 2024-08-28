package Aula28_08.interfac;

public class Gamer implements Computador {
	
	@Override
	public void ligar() {
		System.out.println("Ligando o PC Gamer");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("Reiniciando o PC Gamer");
	}
	
	@Override
	public void desligar() {
		System.out.println("Desligando o PC Gamer");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("Carregando o Sistema do PC Gamer");
	}
}