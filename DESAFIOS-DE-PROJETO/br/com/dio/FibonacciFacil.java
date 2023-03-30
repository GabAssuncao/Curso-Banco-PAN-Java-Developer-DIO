package br.com.dio;

import java.util.Scanner;

public class FibonacciFacil {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a repetição desejada para a série de Fibonacci: ");

        int numero = scan.nextInt();
        int proximo;
        int anterior = 0;
        int atual =  1;

        if (numero < 0 || numero >= 46) {

            System.out.println("Número inválido");

        } else {

            System.out.println("Série equivalente ao número escolhido: ");

            for (int i = 1; i <= numero; i++) {

                if (i == numero) { 

                    System.out.println(anterior);
                    
                } else {

                    System.out.print(anterior + " ");
                    proximo = anterior + atual;
                    anterior = atual;
                    atual = proximo;
                }
            }
        }        
    }
}