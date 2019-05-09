package CondicionaisIfElse;

import java.util.Scanner;

public class exercício10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Insira seu turno de estudos (M-matutino, V-verpetino ou N-noturno):");		
		String turno = scan.next();
		if(turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia! :)");
		
		}else if(turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
		
		}else if (turno.equalsIgnoreCase("n")){
			System.out.println("Boa noite!");

		}else{
			System.out.println("Opção inválida");
			
		}
		//outro modo é com switch case
		System.out.println("Insira seu turno de estudos (M-matutino, V-verpetino ou N-noturno):");
		String turn0 = scan.next();
		
		switch (turno) {
		case "m":
		case "M":  System.out.println("Bom dia! :)");
		break;
		case "v":
		case "V": System.out.println("Boa tarde!");
		break;
		case "n":
		case "N": System.out.println("Boa noite!");
		break;
		default: System.out.println("Opção inválida, try again");
		}
			
	}

}
