package condicionais;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe dois n�meros para an�lise de qual � postivoe negativo");

		System.out.println("Premeiro n�mero: ");
		int num1 = scan.nextInt();
		System.out.println("Segundo n�mero: ");
		int num2 = scan.nextInt();
		if (num1 >= 0 && num2 < 0) {
			System.out.println("O n�mero " + num1 + " � positivo e " + num2 + " e negativo");
		} else if (num1 < 0 && num2 >= 0) {
			System.out.println("O n�mero " + num1 + " � negativo e o n�mero " + num2 + " � positivo");
		} else if (num1 >= 0 && num2 >= 0) {
			System.out.println("Os n�meros " + num1 + " " + num2 + " s�o positivos!");
		}

		{

		}
	}

}
