package br.com.dio;

import java.util.Scanner;

public class ContaEspacosEVogais {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String frase = scan.nextLine();

        scan.close();

        int vogais = 0;
        int espacos = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vogais++;
            } else if (c == ' ') {
                espacos++;
            }
        }

        System.out.println("Espacos em branco: " + espacos + " Vogais: " + vogais);
    }
}