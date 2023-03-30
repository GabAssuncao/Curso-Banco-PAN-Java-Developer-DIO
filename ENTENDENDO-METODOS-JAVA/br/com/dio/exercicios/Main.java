package br.com.dio.exercicios;

public class Main {

    public static void main(String[] args) {
        
        //Calculadora
        System.out.println("\nExercicio calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(3,6);
        Calculadora.multiplicacao(3,6);
        Calculadora.divisao(3,6);

        //Mensagem
        System.out.println("\nExercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(23);
       
        //Empréstimo
        System.out.println("\nExercicio emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        //Quadrilatero
        System.out.println("\nExercicio quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);

        //Retornos
        System.out.println("\nExercicio retornos");
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);
        double areaRetangulo = Quadrilatero.area(5d, 5d);
        System.out.println("Área do quadrado: " + areaRetangulo);
        double areaTrapezio = Quadrilatero.area(7,  8, 9);
        System.out.println("Área do quadrado: " + areaTrapezio);
        double areaLosango = Quadrilatero.area(5f, 5f);
        System.out.println("Área do quadrado: " + areaLosango);


    }
    
}
