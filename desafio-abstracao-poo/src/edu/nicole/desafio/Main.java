package edu.nicole.desafio;

import edu.nicole.desafio.Curso;
import edu.nicole.desafio.Mentoria;
import java.time.LocalDate;

/**
 * @author Nicole Silva
 * @since 24/01/2023
 * 
 */

 public class Main {
   public static void main(String[] args){

    Curso curso1 = new Curso();

    curso1.setTitulo("Bootcamp BackEnd");
    curso1.setDescricao("Bootcamp Banco Inter & DIO:  Práticas BackEnd com JAVA"); 
    curso1.setCargaHoraria(82);

    System.out.println(curso1);

    Curso curso2 = new Curso();

    curso1.setTitulo("Bootcamp FrontEnd");
    curso1.setDescricao("Bootcamp Nubank & DIO:  Práticas FrontEnd com HTML,CSS, JavaScript"); 
    curso1.setCargaHoraria(90);

    System.out.println(curso2);

    Mentoria mentoria = new Mentoria();

    mentoria.setTitulo("Mentoria Java");
    mentoria.setDescricao("Mentoria de carreira DEV java");
    mentoria.setData(LocalDate.now()); // Atribuia a data de criação

    System.out.println(mentoria);

  }

 }


