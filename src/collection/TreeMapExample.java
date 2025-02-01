package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new TreeMap<>();
        estoque.put("Maçã", 50);
        estoque.put("Banana", 30);
        estoque.put("Banana", 40);
        estoque.put("Banana", 50);
        estoque.put("Laranja", 20);
        estoque.put("Amora", 20);
        estoque.put("Romã", 20);
        estoque.put("Mixirica", 20);

        estoque.replaceAll((fruta, quantidade) -> quantidade * 2); // Dobra os valores

        estoque.computeIfPresent("Banana", (key, val) -> val + 10); // Soma 10 unidades à Banana

        estoque.forEach((fruta, quantidade) ->
                System.out.println(fruta + " tem " + quantidade + " unidades")
        );


        Map<Integer, String> estoque2 = new TreeMap<>();
        estoque2.put(50, "Maçã");
        estoque2.put(30, "Banana");
        estoque2.put(20, "Laranja");
        estoque2.put(10, "Amora");
        estoque2.put(80,"Romã");
        estoque2.put(100,"Mixirica");

        //System.out.println(estoque2); // Impressão ordenada pelas chaves


    }
}
