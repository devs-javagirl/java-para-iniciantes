package collection;

import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Ma��");
        set.add("Banana");
        set.add("Laranja");
        set.add("Ma��");//nao adiciona repetido tamb�m
        set.add("Banana");
        set.add("Abacaxi");
        System.out.println(set); // Ordem de inser��o preservada
    }
}
