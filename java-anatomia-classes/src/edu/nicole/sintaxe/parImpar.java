 /** @author Nicole Silva
  *  @since 04/01/2023

 */

package edu.nicole.sintaxe;

public class parImpar{

    /*Este método retorna a paridade de um número (não dinâmico) */

    public static boolean ParImpar(int numero){
        return(numero % 2 == 0);

    }

    public static void main( String []args){

        int numero = 8;

        /*if(parImpar(numero) == true)
           System.out.println("O número é par");

         else
            System.out.println("O número é ímpar");
        */ 

        // Refazendo a condicional utilizando operador ternário
        String resultado =  parImpar(numero)? "O número é par" : "O número é ímpar";
        System.out.println(resultado);
    
    }
}