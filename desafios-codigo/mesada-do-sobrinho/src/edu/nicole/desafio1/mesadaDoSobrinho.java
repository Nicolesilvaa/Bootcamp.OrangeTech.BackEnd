package edu.nicole.desafio1;


 /** @author Nicole Silva
  *  @since 11/01/2023
 */

import java.util.Scanner; 
    
public class mesadaDoSobrinho {
  
    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        int mesada = 50;
        int valorFinal;

        System.out.println("Digite a quantidade de meses que você irá poupar dinheiro");
        int quantidadeMeses = leitor.nextInt();
        
        valorFinal = mesada * quantidadeMeses;
        
        System.out.println("Ao final você terá uma quantia de : " + valorFinal + " reais economizados");
        
    }
}