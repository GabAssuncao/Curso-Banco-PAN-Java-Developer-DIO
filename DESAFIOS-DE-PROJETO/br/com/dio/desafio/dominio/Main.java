package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
            Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("descrição curso Java");
            curso1.setCargaHoraria(8);
            
            Curso curso2 = new Curso();
            curso2.setTitulo("Curso JS");
            curso2.setDescricao("descrição curso JS");
            curso2.setCargaHoraria(4);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("mentoria de java");
            mentoria.setDescricao("descrição mentoria java");
            mentoria.setData(LocalDate.now());

            /*System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria);*/

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devGabryel = new Dev();
            devGabryel.setNome("Gabryel");
            devGabryel.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Gabryel: " + devGabryel.getConteudosInscritos());
            devGabryel.progredir();
            devGabryel.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos Gabryel: " + devGabryel.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos Gabryel: " + devGabryel.getConteudosConcluidos());
            System.out.println("XP: " + devGabryel.calcularTotalXp());

            System.out.println("------------------------------------");

            Dev devJoao = new Dev();
            devJoao.setNome("João");
            devJoao.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
            devJoao.progredir();
            devJoao.progredir();
            devJoao.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos Gabryel: " + devJoao.getConteudosConcluidos());
            System.out.println("XP: " + devJoao.calcularTotalXp());
    }
    
}
