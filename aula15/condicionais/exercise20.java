package CondicionaisIfElse;

import java.util.Scanner;

public class exercise20 {
	// Grau de participação em um crime

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responda com 'sim' ou 'não'");

		System.out.println("Telefonou para a vítima?");
		String resp1 = scan.next();

		System.out.println("Esteve no local do crime?");
		String resp2 = scan.next();

		System.out.println("Mora perto da vítima?");
		String resp3 = scan.next();

		System.out.println("Devia para a vítima?");
		String resp4 = scan.next();

		System.out.println("Já traballaho com a vítima?");
		String resp5 = scan.next();

		int cont = 0;

		if (resp1.equalsIgnoreCase("Sim")) {
			cont++;
		}
		if (resp2.equalsIgnoreCase("Sim")) {
			cont++;
		}
		if (resp3.equalsIgnoreCase("Sim")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("Sim")) {
			cont++;
		}
		if (resp5.equalsIgnoreCase("Sim")) {
			cont++;
		}

		if (cont == 2) {
			System.out.println("Você é suspeito(a)");

		} else if (cont == 3 || cont == 4) {
			System.out.println("Você é cúmplice!!");

		}else if (cont == 5) {
			System.out.println("Você é o(a) assassino(a)");
		}else {
			System.out.println("Você é inocente! relex ;)");
		}
	}
}
