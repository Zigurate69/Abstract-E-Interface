package Aula28_08.interfac;

public class PrincipalVeiculo {

	public static void main(String[] args) {

		Ferrari ferrari = new Ferrari();

		ferrari.ligar();
		ferrari.desligar();
		ferrari.manobrar();
		ferrari.engatar();
		ferrari.acelerar();
		ferrari.frear();
	}
}