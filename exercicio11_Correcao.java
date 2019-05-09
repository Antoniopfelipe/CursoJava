package CondicionaisIfElse;

import java.util.Scanner;

public class exercicio11_Correcao {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos ao seu reajuste salarial");
		System.out.println("Informe seu salário atual:");
		double salario = scan.nextDouble();
		
		double percentual =0;
		
		if (salario <= 280) {
			percentual =  0.2;
			}else if(salario >= 280 && salario <= 700) {
			percentual= 0.15;
			}else if(salario >= 700 && salario <= 1500) {
			percentual = 0.1;
		    }else if(salario > 1500) {
	    	percentual = 0.05;
		    	
	    		
		    }  
		double reajuste = (salario * 0.2) + salario;
		double aumento = reajuste - salario;
		
		System.out.println("Seu salário era: " + salario);
		System.out.println("Obteve um aumento de : " + percentual*100+"%");
		System.out.println("Seu salário atual equivale a: " + reajuste);
		System.out.println("Seu aumento foi de: " + aumento);
	}

}
