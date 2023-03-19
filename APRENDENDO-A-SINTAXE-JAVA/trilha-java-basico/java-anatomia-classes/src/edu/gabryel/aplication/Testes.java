package edu.gabryel.aplication;

public class Testes {

public static void main (String [] args) {
    String primeiroNome = "Gabryel";
    String segundoNome = "Oliveira";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}
    
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}


}
