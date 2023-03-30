package br.com.dio;

import java.util.Scanner;

public class FabricaDeCarros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Custo de fábrica: ");
        int custoFabrica = scan.nextInt();

        System.out.println("Percentual distribuidor: ");
	    int percentualDistribuidor = scan.nextInt();

        System.out.println("Percentual de impostos: ");
	    int percentualImpostos = scan.nextInt(); 

        int custoConsumidor;
        int valorDistribuidor;
        int valorImpostos;

        valorDistribuidor = custoFabrica * percentualDistribuidor / 100;

        valorImpostos = custoFabrica * percentualImpostos / 100;

        custoConsumidor = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.println("O valor final a ser pago pelo consumidor é de: " + custoConsumidor);
    }
}