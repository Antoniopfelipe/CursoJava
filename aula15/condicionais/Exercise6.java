<<<<<<< HEAD:exercicio7.java
package CondicionaisIfElse;
import java.util.Scanner;

public class exercicio7 {
=======
package condicionais;

import java.util.Scanner;

public class Exercise6 {
>>>>>>> bc71d65a8e364104df8b1d4730486483e20420b0:aula15/condicionais/Exercise6.java
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("O maior de todos!!!!");
		System.out.println("-------------------------");
		System.out.println("Digite trï¿½s nï¿½meros");
		System.out.println("Primeiro nï¿½mero: ");
		int num1 = scan.nextInt();
		System.out.println("Segundo nï¿½mero: ");
		int num2 = scan.nextInt();
		System.out.println("Terceiro nï¿½mero: ");
		int num3 = scan.nextInt();

<<<<<<< HEAD:exercicio7.java
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O número " + num1 + " é o maior");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O número " + num2 + " é o maior");
		} else if (num3 >= num1 && num3 >= num1) {
			System.out.println("O número " + num3 + " é o maior");
		}	
	     if (num1 <= num2 && num1 <= num3) {
	    	System.out.println("O número " + num1 + " é o menor");
	    }else if (num2 <= num1 && num2 <= num3) {
	    	System.out.println("O número " + num2 + " é o menor");
	    }else if (num3 <= num1 && num3 <= num1) {
	    	System.out.println("O número " + num3 + " é o menor");
=======
		if (num1 > num2 && num1 > num3) {
			System.out.println("O nï¿½mero " + num1 + " ï¿½ o maior");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O nï¿½mero " + num2 + " ï¿½ o maior");
		} else if (num3 > num1 && num3 > num1) {
			System.out.println("O nï¿½mero " + num3 + " ï¿½ o maior");
		} // else if (num3 == num2 == num1) {

>>>>>>> bc71d65a8e364104df8b1d4730486483e20420b0:aula15/condicionais/Exercise6.java
	}

		
}
}