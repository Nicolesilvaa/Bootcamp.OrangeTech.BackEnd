package edu.nicole.desafio;

import edu.nicole.desafio.Bootcamp;
import edu.nicole.desafio.Curso;
import edu.nicole.desafio.Dev;
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

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("BackEnd OrangeTech");
    bootcamp.setDescricao("Aprendendo JAVA e suas ferramentas");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devFulana = new Dev();
    devFulana.setNome("Fulana");
    devFulana.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos" + devFulana.getConteudosInscritos());
    devFulana.progredir();
    
    System.out.println("Conteúdos Inscritos" + devFulana.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos" + devFulana.getConteudosConcluidos());
    System.out.println("XP"  + devFulana.calcularTotalXP());


  }

 }


