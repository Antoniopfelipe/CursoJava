package CondicionaisIfElse;

import java.util.Scanner;

public class exercise11 {
	public static void main(String[] args) {
		// aumento salarial

		Scanner scan = new Scanner(System.in);
		double reajuste = 0, aumento;

		System.out.println("Vamos ao seu reajuste salarial");
		System.out.println("Informe seu salário atual:");
		double salario = scan.nextDouble();

		if (salario <= 280) {
		reajuste = (salario * 0.2) + salario;
		aumento = reajuste - salario;

		System.out.println("Seu salário era: " + salario);
		System.out.println("Obteve um aumento de 20% e agora equivale a: " + reajuste);
		System.out.println("Seu aumento foi de: " + aumento);

		}else if(salario >= 280 && salario <= 700) {
		reajuste = (salario * 0.15) + salario;
		aumento = reajuste - salario;

		System.out.println("Seu salário era: " + salario);
		System.out.println("Obteve um aumento de 15% e agora equivale a: " + reajuste);
		System.out.println("Seu aumento foi de: " + aumento);
		
		}else if(salario >= 700 && salario <= 1500) {
		reajuste = (salario * 0.1) + salario;
		aumento = reajuste - salario;

		System.out.println("Seu salário era: " + salario);
		System.out.println("Obteve um aumento de 10% e agora equivale a: " + reajuste);
		System.out.println("Seu aumento foi de: " + aumento);
		
	    }else if(salario > 1500) {
        reajuste = (salario * 0.05) + salario;
      	aumento = reajuste - salario;
 
	    System.out.println("Seu salário era: " + salario);
	    System.out.println("Obteve um aumento de 5% e agora equivale a: " + reajuste);
	    System.out.println("Seu aumento foi de: " + aumento);
    }
  }
}
	
	
	
	
	
	
	
