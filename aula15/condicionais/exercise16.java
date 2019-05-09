package CondicionaisIfElse;

import java.util.Scanner;

public class exercise16 {
	// cálculo de raízes de uma eq. de segundo grau

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe os valores das variáveis 'a','b' e 'c'");
		System.out.println("Valor de A:");
		int a = scan.nextInt();
		if (a == 0) {
			System.out.println("Não é uma equação de segundo grau");
		} 

		System.out.println("Valor de B:");
		int b = scan.nextInt();

		System.out.println("Valor de C:");
		int c = scan.nextInt();

		double delta = (b * b) - (4 * a * c);

		if (delta < 0) {
			System.out.println("Delta negativo");
		} else {

			System.out.println("Delta:" + delta);
			
			double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("x1 =" + x1);
			System.out.println("x2 =" + x2);
		}

	}

}
