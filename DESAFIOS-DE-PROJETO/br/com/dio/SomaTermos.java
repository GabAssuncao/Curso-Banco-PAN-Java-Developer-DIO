package br.com.dio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SomaTermos {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos: ");
        double h = 1;
        int n = scan.nextInt();
        double numero = 0;
        double soma = 0;
        
        for (double i = 1; i <= n; i++) {
            
            numero = 1/i;
            soma = soma + numero;
        }

        DecimalFormat formato = new DecimalFormat("#");      
        System.out.println("Entrada | Saída\n  " + n +    "     |   " + (formato.format(soma)));
    }
}