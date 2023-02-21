package edu.nicole.desafio7;
import java.util.Scanner;

 /** @author Nicole Silva
  *  @since 20/02/2023
 */


public class pontosNaCarteira {

    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        
        // TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade
        if(velocidade > 80)
          multas++;
          
        // TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação
        if(multas >= 3)
          System.out.println(multas + " multas. Levou pontos na carteira");
        
        else
          System.out.println(multas + " multas. Nao levou pontos na carteira");
    }

}