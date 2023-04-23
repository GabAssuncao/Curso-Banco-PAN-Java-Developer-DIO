package br.com.dio;

import java.io.IOException;
import java.util.Scanner;

public class PositivosMedia {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int count = 0;
        double soma = 0;
        double numero;

        scan.close();
        
        for (int i = 1; i <= 6; i++) {
        	
            System.out.println("Digite um número: ");
            numero = scan.nextDouble();
            
            if (numero >= 0) {
                soma = soma + numero;
                count++;
            }   
        }
        
        System.out.println("Positivos: " + count);
        System.out.println("Média: " + (soma/count));
    }
}