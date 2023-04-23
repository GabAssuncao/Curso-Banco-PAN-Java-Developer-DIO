package br.com.dio;

import java.util.Scanner;

public class QuintadaDoSeuZe {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int morangos = scan.nextInt();
        int macas = scan.nextInt();

        scan.close();
        
        float valorMorango1 = morangos * 2.50f;
        float valorMorango2 = morangos * 2.20f;

        float valorMaca1 = macas * 1.80f;
        float valorMaca2 = macas * 1.50f;

        float valorCertoMorango;
        float valorCertoMaca;

        if(morangos > 5) { 
            valorCertoMorango = valorMorango2;
        } else {
            valorCertoMorango = valorMorango1;
        }        
        if (macas > 5) {
            valorCertoMaca = valorMaca2;
        } else {
            valorCertoMaca = valorMaca1;
        }
        
        float valorTotal = valorCertoMaca + valorCertoMorango;

        if (valorTotal > 25 | (macas + morangos) > 8) {
            System.out.println(valorTotal - (valorTotal * 0.1));
        } else {
            System.out.println(valorTotal);
        }
        
    }    
}
