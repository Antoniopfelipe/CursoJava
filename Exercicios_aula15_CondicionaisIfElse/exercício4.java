package Exercicios_aula15_CondicionaisIfElse;

import java.util.Scanner;

public class exercício4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Letra consoante ou vogal?");
		System.out.println("Digíte alguma letra:");
		String letra = scan.next();

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
				|| (letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))) {
			System.out.println("Vogal!!!!");

		} else {
			System.out.println("Consoante!!!!");
		}
		// outro modo de efetuar a verificação
		if (letra.length() > 1) { //lenght > é um método da classe String que determina o tamanho da string
			System.out.println("Não é uma letra válida");
		} else {

			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("Vogal");
			default:
				System.out.println("Consoante");
			}

		}

	}
}
