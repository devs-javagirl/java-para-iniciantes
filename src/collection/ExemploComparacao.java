package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploComparacao {
    public static void main(String[] args) {
        // Quantidade de elementos para adicionar
        int quantidade = 1_000_000;

        // Comparação com HashSet
        Set<Integer> hashSet = new HashSet<>();
        long inicioHashSet = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            hashSet.add(i);
        }
        long fimHashSet = System.currentTimeMillis();
        System.out.println("Tempo para adicionar no HashSet: " + (fimHashSet - inicioHashSet) + " ms");

        // Comparação com TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        long inicioTreeSet = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            treeSet.add(i);
        }
        long fimTreeSet = System.currentTimeMillis();
        System.out.println("Tempo para adicionar no TreeSet: " + (fimTreeSet - inicioTreeSet) + " ms");
    }
}
