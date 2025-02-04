package collection.Streams;

import java.util.stream.Stream;

/*
* Criar uma Stream Infinita com iterate()
* Gere os 10 primeiros números múltiplos de 3 usando Stream.iterate().*/
public class Exemplo6 {
    public static void main(String[] args) {
        Stream.iterate(3, n -> n + 3)
                .limit(10)
                .forEach(System.out::println);
    }
}
