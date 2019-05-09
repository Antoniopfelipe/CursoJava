package CondicionaisIfElse;
import java.util.Scanner;

public class exercise7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("O maior de todos!!!!");
		System.out.println("-------------------------");
		System.out.println("Digite três números");
		System.out.println("Primeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Segundo número: ");
		int num2 = scan.nextInt();
		System.out.println("Terceiro número: ");
		int num3 = scan.nextInt();

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
	}

		
}
}