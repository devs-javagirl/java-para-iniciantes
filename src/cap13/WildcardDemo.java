package cap13;

// Usa um curinga.
class NumericFns3<T extends Number> {
    T num;
    // Passa para o construtor uma referência
    // a um objeto numérico.
    NumericFns3(T n) {
        num = n;
    }
    // Retorna o recíproco.
    double reciprocal() {
        return 1 / num.doubleValue();
    }
    // Retorna o componente fracionário.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
    // Determina se os valores absolutos de dois objetos são iguais.
    boolean absEqual(NumericFns3<?> ob) {
        if(Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue()))
            return true;

        return false;
    }
}

public class WildcardDemo {
    public static void main(String args[]) {
        NumericFns3<Integer> iOb =
                new NumericFns3<Integer>(6);
        NumericFns3<Double> dOb =
                new NumericFns3<Double>(-6.0);
        NumericFns3<Long> lOb =
                new NumericFns3<Long>(5L);
        System.out.println("Testing iOb and dOb.");

        // Nesta chamada, o tipo curinga equivale a Double.
        if(iOb.absEqual(dOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
        System.out.println();

        System.out.println("Testing iOb and lOb.");

        // Nesta chamada, o curinga equivale a Long.
        if(iOb.absEqual(lOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
    }
}
