package br.com.dio.exercitando5;

class Calculadora implements OperacaoMatematica { //Caso não inclua todos os metodos da interface, o programa da erro!

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Somas: " + operando1 + operando2);
    }
   
    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Subtração: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("Multiplicação: " + (operando1 * operando2));
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println("Divisão: " + (operando1 / operando2));
    }
    
}
