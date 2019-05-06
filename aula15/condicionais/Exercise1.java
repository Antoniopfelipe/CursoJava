package condicionais;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois n�meros para an�lise de maior ou menor");
		System.out.println("Primeiro n�mero: ");
	    int num1 = scan.nextInt();
	    System.out.println("Segundo n�mero: ");
	    int num2 = scan.nextInt();
	    
	   if(num1>num2) {
		   System.out.println("O n�mero "+ num1+" � maior que " +num2);
		    
	   }else
		   System.out.println("O n�mero "+ num2+" � maior que " +num1);
	   {
	
	   }
	}
}