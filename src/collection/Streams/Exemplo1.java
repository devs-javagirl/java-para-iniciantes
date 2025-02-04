package collection.Streams;

import java.util.ArrayList;
import java.util.List;

/*
* Filtrar e Transformar uma Lista de Strings
* Dada uma lista de nomes, filtre apenas os que come�am com a letra "A"
* e transforme-os para letras mai�sculas.
*/
public class Exemplo1 {
    public static void main(String[] args) {
        List<String> lista = List.of("Ana", "Jo�o", "Aline", "Alan", "Bruno");

        lista.stream()
                .filter(n -> n.startsWith("A"))
                .map(String :: toUpperCase)
                .forEach(System.out::println);
    }
}
