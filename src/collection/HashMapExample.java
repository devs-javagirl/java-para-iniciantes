package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("Maçã", 50);
        estoque.put("Banana", 30);
        estoque.put("Laranja", 20);
        estoque.put("Melão", 20);
        estoque.put("Romã", 20);
        estoque.put("Mixirica", 20);

        System.out.println(estoque); // Impressão sem ordem específica
    }
}
