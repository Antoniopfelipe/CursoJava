package CondicionaisIfElse;

import java.util.Scanner;

public class exercicio18 {
	 public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Digite dois números inteiros");
		 System.out.println("First number:");
		 int num1 = scan.nextInt();
		 
		 if (num1 % 2 == 0) {
			 System.out.println("Par");
		 }else {
			 System.out.println("Ímpar");
		 }
		 
	 }

}
