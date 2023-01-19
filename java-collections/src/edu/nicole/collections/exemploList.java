package edu.nicole.collections;

/**
 * @author Nicole Silva 
 * @since 19/01/2023
 */

 import java.util.ArrayList;
 import java.util.List;

 public class exemploList{
    public static void main(String[] args) {
        
        List <Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.0);

        System.out.println("Exibindo elementos da lista:\n " + notas);
        System.out.println("Exibindo posição da nota 8.5 na lista:\n" + notas.indexOf(8.5));

        notas.add(3,10.0);

        System.out.println("Uma nova nota foi adicionada na posição 3\n");
        System.out.println("A nota  9.5 existe na nossa lista?\n");

        if(notas.contains(9.5))
            System.out.println("Sim!\n");
        else 
            System.out.println("Não!\n");

        System.out.println("Aqui estão todos os elementos da lista");

        for(Double nota : notas)
            System.out.println(nota);
        

    }

 }