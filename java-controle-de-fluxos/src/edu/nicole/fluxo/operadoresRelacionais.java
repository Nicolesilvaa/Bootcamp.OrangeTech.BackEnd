 /** @author Nicole Silva
  *  @since 09/01/2023
 */

package edu.nicole.fluxo;

public class operadoresRelacionais{

    /*Este método tem como finalida praticar a utilização de operadores relacionais. */

    public static void main(String[] args) {
    
        int valor1 = 10;
        int valor2 = 30;
        String palavra1 = "Casa";
        String palavra2 = " Porta";

        System.out.println(" 10 é maior que 30 ?");
        System.out.println(valor1 > valor2); //False

        System.out.println("\n 10 é menor que 30? ");
        System.out.println(valor1 < valor2); //True

        System.out.println("\n A palavra 'casa' é igual a palavra 'caneta' ? \n");
        System.out.println(palavra1 == palavra2); //False

        System.out.println("\n A palavra 'casa' é diferente da palavra 'caneta' ? ");
        System.out.println(palavra1 != palavra2); //True
       



    }

}
