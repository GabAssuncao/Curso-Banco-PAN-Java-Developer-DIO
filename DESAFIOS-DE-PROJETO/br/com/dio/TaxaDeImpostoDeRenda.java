package br.com.dio;

import java.io.IOException;
import java.util.Scanner;

public class TaxaDeImpostoDeRenda {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        
        double renda = scan.nextDouble();
        double imposto;

        scan.close();
     
        if (renda <= 2000) {
            imposto = 0;
        } else if (renda <= 3000) {
            imposto = (renda - 2000) * 0.08;
        } else if (renda <= 4500) {
            imposto = 1000 * 0.08 + (renda - 3000) * 0.18;
        } else {
            imposto = 1000 * 0.08 + 1500 * 0.18 + (renda - 4500) * 0.28;
        }

        if (imposto == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f", imposto);
        }    
    }
        
}
