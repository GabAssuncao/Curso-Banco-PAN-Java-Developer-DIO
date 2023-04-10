package br.com.collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        /*System.out.println("Imprima todos os elemntos dessa lista de String: ");
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        System.out.println("Imprima todos os elemntos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println); //simplificação do método acima

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set: ");
        /*Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet()); */
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
        /*numerosAleatorios.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });*/
        //List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()); //simplificação do método acima

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        /*List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if (i %2 == 0 && i > 2) return true;
                return false;
            }
        }).collect(Collectors.toList());*/
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i %2 == 0 && i > 2).collect(Collectors.toList()); //simplificação do método acima
        System.out.println(ListParesMaioresQue2);

        System.out.println("Mostre a média dos números: ");
        /*numerosAleatorios.stream().mapToInt(new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String s) {
                return Integer.parseInt(s);
            }
        });*/
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println); //simplificação do método acima  

        List<Integer> collectList = numerosAleatoriosInteger.stream().map(Integer::parseInt).collect(Collectors.toList());        
        System.out.println("Remova os valores impares: ");
        /*numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 != 0) return true;
                return false;
            }
        });*/
        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0)); //simplificação do método acima
        System.out.println(numerosAleatoriosInteger);
    }    
}
