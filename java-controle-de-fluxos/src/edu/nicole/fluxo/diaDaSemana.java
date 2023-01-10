package edu.nicole.fluxo;

 /** @author Nicole Silva
  *  @since 09/01/2023
 */

import java.util.Scanner; 

public class diaDaSemana{
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("...............................");
        System.out.println("Descobrindo a ordem dos dias da semana ");
        System.out.println("...............................\n");
        
        System.out.println("Digite o dia da semana em questão: ");
        String diaSemana = entrada.next();

        switch(diaSemana){

            case "Domingo":
                System.out.println("1° dia da semana");
                break;

            case "Segunda":
                System.out.println("2° dia da semana");
                break;

            case "Terça":
                System.out.println("3° dia da semana");
                break;

            case "Quarta":
                System.out.println("4° dia da semana");
                break;

            case "Quinta":
                System.out.println("5° dia da semana");
                break;

            case "Sexta":
                System.out.println("6° dia da semana");
                break;

            case "Sábado":
                System.out.println("7° dia da semana");
                break;

            default:
                System.out.println("Dia da semana inexistente");

            
        }
        


    }
}