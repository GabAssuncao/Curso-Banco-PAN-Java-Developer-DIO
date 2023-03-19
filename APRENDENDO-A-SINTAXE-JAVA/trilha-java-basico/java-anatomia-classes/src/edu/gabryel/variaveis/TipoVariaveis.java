package edu.gabryel.variaveis;

public class TipoVariaveis {
    
    public static void main(String[] args) {
        boolean condicao1=true;
        boolean condicao2=false;
        
        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condicoes e verdadeiras");
        }

        System.out.println("fim");
    }
}
