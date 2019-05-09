package CondicionaisIfElse;

import java.util.Scanner;

public class exercicio15 {
	public static void main(String[] args) {

		// tipo de triângulo

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o valor do primeiro lado do triângulo:");
		int lado1 = scan.nextInt();
		System.out.println("Informe o valor do segundo lado do triângulo:");
		int lado2 = scan.nextInt();
		System.out.println("Informe o valor do terceiro lado do triângulo:");
		int lado3 = scan.nextInt();

		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {

			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("É um triangulo equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("É um traingulo isósceles");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("É um traingulo escaleno");
			}
			else {
				System.out.println("Não é um triângulo");

			}
		 }
	 }
 }
