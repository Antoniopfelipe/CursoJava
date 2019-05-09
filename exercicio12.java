package CondicionaisIfElse;

import java.util.Scanner;

public class exercicio12 {
      //cáculo folha de pagamento
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			 
			System.out.println("Digite o valor da sua hora trabalhadada: ");
			int valorHora = scan.nextInt();
			System.out.println("Digite a quantidade de horas trabalhads no mês: ");
			int hora = scan.nextInt();
			
			double salarioBruto = valorHora * hora;
			
			double percentualIr = 0;
			
			if (salarioBruto <= 900) {
				percentualIr = 0;
			}else if (salarioBruto > 900 && salarioBruto <= 1500) {
				percentualIr = 0.05;
			}else if (salarioBruto > 1500 && salarioBruto <= 2500) {
				percentualIr = 0.1;
			}else if (salarioBruto > 2500) {
				percentualIr = 0.20;
     
			} 
				
	         double fgts = salarioBruto * 0.11;
	         double inss = salarioBruto * 0.1;
             double IR = percentualIr * salarioBruto ;
             double desconto = IR + inss;
             double salarioLiquido = salarioBruto - desconto;
            
             System.out.println("Salário bruto: ("+hora+" * "+valorHora+") " + salarioBruto);
             System.out.println("Imposto de renda(IR): " +percentualIr * 100+" %" + IR);
             System.out.println("INSS (10%):" + inss);
             System.out.println("FGTS (11%): " + fgts);
             System.out.println("Total de descontos: " + desconto);
             System.out.println("Salário liquído: " + salarioLiquido);
      
      

    }
}