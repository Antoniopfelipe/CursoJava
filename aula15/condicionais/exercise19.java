package CondicionaisIfElse;

import java.util.Scanner;

public class exercise19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("First number:");
		int num1 = scan.nextInt();
		System.out.println("Second number:");
		int num2 = scan.nextInt();

		System.out.println("Escolha a op��o da oppera��o");
		System.out.println("1- Multiplica��o");
		System.out.println("2- Divis�o");
		System.out.println("3- Adi��o");
		System.out.println("4- Subtra��o");
		int opcao = scan.nextInt();

		double result = 0;
		boolean valida = true;

		switch (opcao) {

		case 1:
			result = num1 * num2;
			System.out.println("Mutipli��o: " + result);
			break;
		case 2:
			result = num1 / num2;
			System.out.println("Divis�o: " + result);
			break;
		case 3:
			result = num1 + num2;
			System.out.println("Adi��o: " + result);
			break;
		case 4:
			result = num1 - num2;
			System.out.println("Subtra��o: " + result);
			break;
		default:
			System.out.println("Op��o inv�lida, try again please!!");
			valida = false;
		}

		if (valida) {

			if (result >= 0) {
				System.out.println("Resultado � positivo");
			} else {
				System.out.println("Resultado � negativo");
			}

			if (result % 2 == 0) {
				System.out.println("Resultado � par");
			} else {
				System.out.println("Resultado � �mpar");
			}
		}
	}
}
