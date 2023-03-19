package edu.gabryel.projeto.sistema;

public class Usuario {
    public static void main(String [] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual:" + smartTv.canal);
        System.out.println("Volume Atual:" + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

    }
}