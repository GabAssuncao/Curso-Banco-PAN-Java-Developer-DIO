package br.com.dio.exercicios;

/* 
 * Parte do código comentada se refere à aula de montagem do quadrilátero!
 * Área ativa se refere à aula de retorno!
 */

public class Quadrilatero {

    //public static void area(double lado) {
    public static double area(double lado) {
        
        //System.out.println("Área do quadrado: " + lado * lado);

        return lado * lado;

    }

    //public static void area(double lado1, double lado2) {
    public static double area(double lado1, double lado2) {
        
        //System.out.println("Área do retângulo: " + lado1 * lado2);

        return lado1 * lado2;

    }

    //public static void area(double baseMaior, double baseMenor, double altura) {
    public static double area(double baseMaior, double baseMenor, double altura) {
        
        //System.out.println("Área do trapézio: " + ((baseMaior+baseMenor)*altura) / 2);

        return ((baseMaior+baseMenor)*altura) / 2;

    }

    //public static void area(float diagonal1, float diagonal2) {
    public static float area(float diagonal1, float diagonal2) {
        
        //System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);

        return (diagonal1 * diagonal2) / 2;

    }

    public static void xpto() {

        System.out.println("Antes");
        return;
        
    }
    
}
