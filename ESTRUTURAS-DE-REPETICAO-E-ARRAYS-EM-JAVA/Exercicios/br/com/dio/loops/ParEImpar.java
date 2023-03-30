package br.com.dio.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares 
 * e a quantidade de números impares.
 */

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int quantNumeros;
        int count = 0;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;  // se a divisão do número por dois, o resto for 0, somará em pares
            else quantImpares++;                // se não, somará em ímpares!

            count++;

        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);

    }
    
}
