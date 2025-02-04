package collection.Streams;

/*
* Encontrar o Maior N�mero
* Dada uma lista de n�meros inteiros, encontre o maior n�mero usando max().*/

import java.util.List;
import java.util.Optional;

public class Exemplo3 {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1,5,8,7,6,3,22,10);

        Optional<Integer> maior = lista.stream()
                .max(Integer :: compareTo);
                //mesma coisa de
                //.max((a, b) -> a.compareTo(b));
        System.out.println("Maior = " + maior.get());
    }
}
