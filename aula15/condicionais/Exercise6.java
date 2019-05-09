package condicionais;

import java.util.Scanner;

public class Exercise6 {
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

		if (num1 > num2 && num1 > num3) {
			System.out.println("O n�mero " + num1 + " � o maior");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O n�mero " + num2 + " � o maior");
		} else if (num3 > num1 && num3 > num1) {
			System.out.println("O n�mero " + num3 + " � o maior");
		} // else if (num3 == num2 == num1) {

	}

}
