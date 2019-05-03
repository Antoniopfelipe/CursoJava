package Exercicios_aula15_CondicionaisIfElse;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe dois números para análise de qual é postivoe negativo");

		System.out.println("Premeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Segundo número: ");
		int num2 = scan.nextInt();
		if (num1 >= 0 && num2 < 0) {
			System.out.println("O número " + num1 + " é positivo e " + num2 + " e negativo");
		} else if (num1 < 0 && num2 >= 0) {
			System.out.println("O número " + num1 + " é negativo e o número " + num2 + " é positivo");
		} else if (num1 >= 0 && num2 >= 0) {
			System.out.println("Os números " + num1 + " " + num2 + " são positivos!");
		}

		{

		}
	}

}
