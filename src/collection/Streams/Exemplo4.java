package collection.Streams;

import java.util.List;

/*Contar Palavras com Mais de 5 Letras
Dada uma lista de palavras, conte quantas têm mais de 5 letras.
*/
public class Exemplo4 {
    public static void main(String[] args) {
        List<String> lista = List.of("banana", "uva", "abacaxi", "kiwi", "laranja");

        lista.stream()
                .filter(l -> l.length() > 5)
                .forEach(System.out::println);
    }
}
