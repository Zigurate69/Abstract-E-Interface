package Aula28_08.interfac;

public class PrincipalCalc {

	public static void main(String[] args) {
		
		Calculando calc = new Calculando();
		
		System.out.println(calc.somar());
		System.out.println(calc.sub());
		System.out.println(calc.multi());
		System.out.println(calc.div());
		System.out.println(calc.expoente());
	}
}