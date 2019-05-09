package CondicionaisIfElse;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor da quantidade em KG de morango:");
		double kgMorango = scan.nextDouble();

		System.out.println("Digite o valor da quantidade em KG de maça:");
		double kgMaca = scan.nextDouble();

		double valorPago1 = 0;
		double valorPago2 = 0;
		double percentualDesc = 0;
		
		

		 if (kgMorango > 5) {
			 valorPago1 = kgMorango * 1.8;
		}
		if (kgMaca <= 5) {
			valorPago2 = kgMaca * 2.2;
			
		}if (kgMorango <= 5 && kgMorango != 8) {
				valorPago1 = kgMorango * 2.5;

		} else if (kgMaca > 5 && kgMaca != 8) {
			valorPago2 = kgMaca * 1.5;
			
	     if (valorPago1 > 25 || kgMorango + kgMaca > 8) {
				percentualDesc = 0.1;

			System.out.println("Valor da compra do morango: R$" + valorPago1 * percentualDesc);
			System.out.println("Valor da compra da maça: R$" + valorPago2 * percentualDesc);
			System.out.println("Valor da compra: R$" + valorPago1);
		    System.out.println("Valor da compra: R$" + valorPago2);
			
		}		    
	  }
   }
}
