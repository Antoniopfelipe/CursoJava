package CondicionaisIfElse;

import java.util.Scanner;

public class exercicio15 {
	public static void main(String[] args) {

		// tipo de tri�ngulo

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o valor do primeiro lado do tri�ngulo:");
		int lado1 = scan.nextInt();
		System.out.println("Informe o valor do segundo lado do tri�ngulo:");
		int lado2 = scan.nextInt();
		System.out.println("Informe o valor do terceiro lado do tri�ngulo:");
		int lado3 = scan.nextInt();

		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {

			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("� um triangulo equil�tero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("� um traingulo is�sceles");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("� um traingulo escaleno");
			}
			else {
				System.out.println("N�o � um tri�ngulo");

			}
		 }
	 }
 }
