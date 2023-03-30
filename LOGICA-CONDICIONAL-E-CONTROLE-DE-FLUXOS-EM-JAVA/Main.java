/**
 * Classe de exemplo para o exercício da Aula 1 de Operadores Lógicos e relacionais, Controel de fluxo e Blocos.
 */
public class Main {

    public static void main(String[] args) {
        
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        double d2 = 37.9d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s3 = "Fulano";
        String s2 = "Ciclano";
        boolean b1 = true;
        boolean b2 = false;
        long L1 = 1597L;
        long L2 = 8997L;
        byte y1 = 1;
        byte y2 = 2;
        short h1 = 25;
        short h2 = 30;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 > f2 " + (f1 > f2));
        System.out.println("f1 <= f2 " + (f1 <= f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
        System.out.println("s1 > s2 " + (s1 > s2));
        System.out.println("s1 <= s2 " + (s1 <= s2));

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        System.out.println("b1 > b2 " + (b1 > b2));
        System.out.println("b1 <= b2 " + (b1 <= b2));

        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 " + (d1 == h1));
        System.out.println("s2 != c1 " + (s2 != c1));
        System.out.println("s3 != i1 " + (s3 != i1));

        System.out.println("L1 == i2 " + (L1 == i2));
        System.out.println("L2 >= i1 " + (L2 >= i1));
        System.out.println("y1 != h1 " + (y1 != h1));

    }
}