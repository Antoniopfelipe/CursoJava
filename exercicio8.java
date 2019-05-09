package CondicionaisIfElse;

import java.util.Scanner;

public class exercicio8 {
	//escrevendo em ordem decrescente
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Irforme três números");
		System.out.println("Primeiro número:");
		int num1 = scan.nextInt();
		System.out.println("Segundo número:");
		int num2 = scan.nextInt();
		System.out.println("Terceiro número:");
		int num3 = scan.nextInt();	
	
		if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
			System.out.println(num3 + "-" + num2 + "-" +num1);
		
		}else if(num1 <= num2 && num1 <= num3 && num3 <= num2){
			System.out.println(num2 + "-" + num3 + "-" +num1);
		
		}else if(num2 <= num1 && num2 <= num3 && num1 <= num3){
			System.out.println(num3 + "-" + num3 + "-" +num1);
		
		}else if(num2 <= num3 && num2 <= num1 && num3 <= num1) {
			System.out.println(num1 + "-" + num3 + "-" +num2);
		
		}else if(num3 <= num1 && num3 <= num2 && num1 <= num2) {
			System.out.println(num2 + "-" + num1 + "-" +num3);
	
		}else if(num3 <= num2 && num3 <= num1 && num2 <= num1) {
			System.out.println(num1 + "-" + num2 + "-" +num3);
		}
	}
}
	
	

	