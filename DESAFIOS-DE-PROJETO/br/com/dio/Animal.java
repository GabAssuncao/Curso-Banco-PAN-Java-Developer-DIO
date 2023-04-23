package br.com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Animal {

	public static void main(String[] args)  throws IOException {
		Scanner scan = new Scanner(System.in);
		
		String animal1 = scan.nextLine();
		String animal2 = scan.nextLine();
		String animal3 = scan.nextLine();

        scan.close();

        if (animal1.equalsIgnoreCase("vertebrado")) {
			if (animal2.equalsIgnoreCase("ave")) {
				if (animal3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (animal3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (animal2.equalsIgnoreCase("inseto")) {
				if (animal3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (animal3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}			
			}
		}
	}
}
