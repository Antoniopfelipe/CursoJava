package condicionais;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("M�dia simples entre duas notas");
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		
		 if (media == 10) {
			System.out.println("Aluno aprovado com disitin��o: " + media);
		 }else if (media >= 7) {
				System.out.println("Aluno aprovado com m�dia: " + media);
		}else {
			System.out.println("Aluno reprovado com m�dia: "+ media);
		}

	}

}
