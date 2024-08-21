package cap5;

public class Exercicio4 {
    //4 Altere a classificação da seção Tente isto 5-1 para que classifique um array de strings. Demonstre que funciona.
    public static void main(String args[]) {
        String strs[] = {
                "this", "is", "a", "test",
                "of", "a", "string", "sort"
        } ;
        int a, b;
        String t;
        int size;
        size = strs.length; // número de elementos a serem classificados
        // exibe o array original
        System.out.print("Original array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + strs[i]);
        System.out.println();
        // Esta é a classificação por bolha para strings.
        for(a=1; a < size; a++)
            for(b=size-1; b >= a; b--) {
                if(strs[b-1].compareTo(strs[b]) > 0) { // se estiver fora de ordem alfabetica
                    // troca os elementos
                    t = strs[b-1];
                    strs[b-1] = strs[b];
                    strs[b] = t;
                }
            }
        // exibe o array classificado
        System.out.print("Sorted array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + strs[i]);
        System.out.println();
    }
}
