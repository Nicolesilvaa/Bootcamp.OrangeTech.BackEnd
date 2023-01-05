package edu.nicole.sintaxe; 

public class parImpar{

    public static boolean parImpar(int numero){
        return(numero % 2 == 0);

    }

    public static void main( String []args){

        int numero = 5;
        boolean resultado = parImpar(numero);

        if(parImpar(numero) == true)
            System.out.println("O número é par");

        else
            System.out.println("O número é ímpar");
        
    }
}