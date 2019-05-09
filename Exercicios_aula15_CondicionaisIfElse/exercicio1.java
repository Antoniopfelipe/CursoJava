package Exercicios_aula15_CondicionaisIfElse;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois números para análise de maior ou menor");
		System.out.println("Primeiro número: ");
	    int num1 = scan.nextInt();
	    System.out.println("Segundo número: ");
	    int num2 = scan.nextInt();
	    
	   if(num1>num2) {
		   System.out.println("O número "+ num1+" é maior que " +num2);
		    
	   }else
		   System.out.println("O número "+ num2+" é maior que " +num1);
	   {
	
	   }
	}
}