package CondicionaisIfElse;

import java.util.Scanner;

public class exercise19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("First number:");
		int num1 = scan.nextInt();
		System.out.println("Second number:");
		int num2 = scan.nextInt();

		System.out.println("Escolha a opção da opperação");
		System.out.println("1- Multiplicação");
		System.out.println("2- Divisão");
		System.out.println("3- Adição");
		System.out.println("4- Subtração");
		int opcao = scan.nextInt();

		double result = 0;
		boolean valida = true;

		switch (opcao) {

		case 1:
			result = num1 * num2;
			System.out.println("Mutiplição: " + result);
			break;
		case 2:
			result = num1 / num2;
			System.out.println("Divisão: " + result);
			break;
		case 3:
			result = num1 + num2;
			System.out.println("Adição: " + result);
			break;
		case 4:
			result = num1 - num2;
			System.out.println("Subtração: " + result);
			break;
		default:
			System.out.println("Opção inválida, try again please!!");
			valida = false;
		}

		if (valida) {

			if (result >= 0) {
				System.out.println("Resultado é positivo");
			} else {
				System.out.println("Resultado é negativo");
			}

			if (result % 2 == 0) {
				System.out.println("Resultado é par");
			} else {
				System.out.println("Resultado é ímpar");
			}
		}
	}
}
