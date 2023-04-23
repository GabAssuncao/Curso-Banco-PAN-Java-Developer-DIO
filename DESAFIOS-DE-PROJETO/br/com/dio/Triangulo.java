package br.com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Triangulo{
	
	public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
		
        double a, b, c;
        
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        scan.close();

        if((a < b + c) && (b < a + c) && (c < a + b)) {
            double p = a + b + c;

            System.out.println("Perimetro = " + p);
        } else {
            double area = ((a + b) * c) / 2;

            System.out.println("Area = " + area);
        }
    }
}
