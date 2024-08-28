package Aula28_08.interfac;

public class PrincipalComputador {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer();
		Casa casa = new Casa();
		
		System.out.println("--------------------PC Gamer--------------------");
		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregandoSistema();
		
		System.out.println("--------------------Computador Casa--------------------");
		casa.ligar();
		casa.reiniciar();
		casa.desligar();
		casa.carregandoSistema();
	}

}
