package condicionais;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);

        System.out.println("Letra consoante ou vogal?");
        System.out.println("Dig�te alguma letra:");
        String letra=scan.next();

        if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")
        ||(letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u"))){
            System.out.println("Vogal!!!!");
        } else {
            System.out.println("Consoante!!!!");
        }
        // outro modo de efetuar a verifica��o
        if(letra.length()>1){ //lenght > � um m�todo da classe String que determina o tamanho da string
            System.out.println("N�o � uma letra v�lida");
        } else {

            switch(letra){
                case"a":
                case"e":
                case"i":
                case"o":
                case"u":
                case"A":
                case"E":
                case"I":
                case"O":
                case"U":
                    System.out.println("Vogal");
                default:
                    System.out.println("Consoante");
            }

        }

    }
}
