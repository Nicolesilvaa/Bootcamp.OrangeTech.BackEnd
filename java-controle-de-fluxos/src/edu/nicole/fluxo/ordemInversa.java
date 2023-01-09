package edu.nicole.fluxo;
//import  java.util.Scanner; 

public class ordemInversa{

    /*Este método inverte os valores de um array */

    public static void main(String[] args) {
        
        int [] vetor = {9,6,-9,80,7,48};
        
        System.out.println("Vetor: ");

        for(int i = 0; i < (vetor.length - 1); i++)
            System.out.println(vetor[i] + " ");
        

        System.out.println("Vetor inverso: ");
        
        for(int j = (vetor.length - 1); j == 0; j--)
            System.out.println(vetor[j] + " ");
        
    }
}