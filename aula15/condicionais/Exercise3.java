package condicionais;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as letras (F ou M): ");
		String abc = scan.next();
	    
		if (abc.equalsIgnoreCase("f")) {
	    System.out.println("F - Feminino");
	    }else if(abc.equalsIgnoreCase("M")) {
	    	System.out.println("M - Masculino");
	    }else {
	    		System.out.println("try again,sexo inv�lido");
	    	}
	    	
	    }
		
		
		
	}
 

