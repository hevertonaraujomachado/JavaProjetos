package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Por Favor Digite seu Peso?");
		Scanner teclado = new Scanner(System.in);
		
		Float peso = teclado.nextFloat();
		
		System.out.println("Digite a sua altura (m)");
		
		Float altura = teclado.nextFloat();
		
		Float imc = peso /(altura*altura);
		
		System.out.printf("Seu IMC eh: %.2f",+ imc);
		
	}

}
