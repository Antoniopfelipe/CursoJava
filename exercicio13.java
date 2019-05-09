package CondicionaisIfElse;

import java.util.Scanner;

public class exercicio13 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número(1-7)");
		int num = scan.nextInt();

		switch (num) {
		case 1:
			System.out.println(num + "-Domingo");
			break;
		case 2:
			System.out.println(num + "-Segunda");
			break;
		case 3:
			System.out.println(num + "-Terça");
			break;
		case 4:
			System.out.println(num + "-Quarta");
			break;
		case 5:
			System.out.println(num + "-Quinta");
			break;
		case 6:
			System.out.println(num + "-Sexta");
			break;
		case 7:
			System.out.println(num + "-Sábado");
			break;
			default: System.out.println("Try again!!");

		}
	}
}
