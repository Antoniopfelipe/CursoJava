package CondicionaisIfElse;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("--------------------");
		System.out.println("  GASOLINA R$ 2,50                ");
		System.out.println("  ÁLCOOL   R$ 1,90                 ");
		System.out.println("--------------------");

		System.out.println("Insira o tipo de combustível G-gasolina ou A-álcool");
		String tipo = scan.next();

		System.out.println("Quantos litros deseja comprar de " + tipo + "?");
		int litro = scan.nextInt();

		double precoGas = 2.5;
		double precoAlc = 1.9;
		double percentual = 0;
		double total = 0;
		double totalDesc;

		if (tipo.equalsIgnoreCase("A")) {

		}
		if (litro <= 20) {
			percentual = 0.03;
		} else {
			percentual = 0.05;
		}

		total = litro * precoAlc;

		if (tipo.equalsIgnoreCase("G")) {

		}
		if (litro <= 20) {
			percentual = 0.04;
		} else {
			percentual = 0.06;
		}
		total = litro * precoGas;
		totalDesc = total * percentual;
		
		double precoAPagar = total - totalDesc;
		
		System.out.println("Valor a ser pago" + precoAPagar);
	}
	;
}
