package Aula28_08.interfac;

public class Calculando implements Calculos {
	
	@Override
	public double somar() {
		return 10+15;
	}
	
	@Override
	public double sub() {
		return 15-10;
	}
	
	@Override
	public double multi() {
		return 5*5;
	}
	
	@Override
	public int div() {
		return 5/5;
	}
	
	@Override
	public int expoente() {
		return 2*2*2;
	}
}