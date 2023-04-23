package br.com.dio;

import java.util.Scanner;

public class Dragao {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Daenerys: Quantos seres vivos gostaria de escanear? ");
        int casos = scan.nextInt();

        scan.close();

        for (int i = 1; i <= casos; i++) {

            System.out.println("Poder de luta escaneado para o ser vivo " + i + ":");
            int poderDeLuta = scan.nextInt();
            
            if (poderDeLuta > 8000) {
                System.out.println("Daenerys: Mais de 8000!");
            } else {
                System.out.println("Daenerys: Inseto!");
            }
        }
    }
}
