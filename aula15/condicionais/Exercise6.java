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
		System.out.println("Digite tr�s n�meros");
		System.out.println("Primeiro n�mero: ");
		int num1 = scan.nextInt();
		System.out.println("Segundo n�mero: ");
		int num2 = scan.nextInt();
		System.out.println("Terceiro n�mero: ");
		int num3 = scan.nextInt();

<<<<<<< HEAD:exercicio7.java
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O n�mero " + num1 + " � o maior");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O n�mero " + num2 + " � o maior");
		} else if (num3 >= num1 && num3 >= num1) {
			System.out.println("O n�mero " + num3 + " � o maior");
		}	
	     if (num1 <= num2 && num1 <= num3) {
	    	System.out.println("O n�mero " + num1 + " � o menor");
	    }else if (num2 <= num1 && num2 <= num3) {
	    	System.out.println("O n�mero " + num2 + " � o menor");
	    }else if (num3 <= num1 && num3 <= num1) {
	    	System.out.println("O n�mero " + num3 + " � o menor");
=======
		if (num1 > num2 && num1 > num3) {
			System.out.println("O n�mero " + num1 + " � o maior");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O n�mero " + num2 + " � o maior");
		} else if (num3 > num1 && num3 > num1) {
			System.out.println("O n�mero " + num3 + " � o maior");
		} // else if (num3 == num2 == num1) {

>>>>>>> bc71d65a8e364104df8b1d4730486483e20420b0:aula15/condicionais/Exercise6.java
	}

		
}
}