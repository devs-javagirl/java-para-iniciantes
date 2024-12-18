package cap13;

// Demonstra um m�todo gen�rico simples.
class GenericMethodDemo {
    // Determina se o conte�do de dois arrays � igual.
    //Camparable -> permite que objetos de uma classe sejam comparados entre si
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) { // M�todo gen�rico

        // Se o tamanho dos arrays for diferente, os arrays tamb�m ser�o.
        if(x.length != y.length)
            return false;

        for(int i=0; i < x.length; i++)
            if(!x[i].equals(y[i]))
                return false; // os arrays s�o diferentes

        return true; // os conte�dos dos arrays s�o equivalentes
    }

    public static void main(String args[]) {
        Integer nums[] = { 1, 2, 3, 4, 5 };
        Integer nums2[] = { 1, 2, 3, 4, 5 };
        Integer nums3[] = { 1, 2, 7, 4, 5 };
        Integer nums4[] = { 1, 2, 7, 4, 5, 6 };

        if(arraysEqual(nums, nums))
            System.out.println("nums equals nums");

        //Os argumentos de tipo de T e V s�o determinados implicitamente quando o m�todo � chamado.
        if(arraysEqual(nums, nums2))
            System.out.println("nums equals nums2");

        if(arraysEqual(nums, nums3))
            System.out.println("nums equals nums3");

        if(arraysEqual(nums, nums4))
            System.out.println("nums equals nums4");

        // Cria um array de Doubles
        Double dvals[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        // Essa parte n�o ser� compilada, porque nums
        // e dvals n�o s�o do mesmo tipo.
        // if(arraysEqual(nums, dvals))
        // System.out.println("nums equals dvals");
    }
}
