package cap13;

public class NumericFns2<T extends Number> {
    T num;
    // Passa para o construtor uma referência a um objeto numérico.
    NumericFns2(T n) {
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

    ///usado no Example1.java
    // Este código não funcionará!
    // Determina se os valores absolutos de dois objetos são iguais.
    boolean absEqual(NumericFns2<T> ob) {
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;

        return false;
    }
}


class BoundsDemo {
    public static void main(String args[]) {
        // Integer pode ser usado porque é subclasse de Number.
        NumericFns2<Integer> iOb =
                new NumericFns2<Integer>(5);
        System.out.println("Reciprocal of iOb is " +
                iOb.reciprocal());
        System.out.println("Fractional component of iOb is " +
                iOb.fraction());
        System.out.println();

        // Double também pode ser usado.
        NumericFns2<Double> dOb =
                new NumericFns2<Double>(5.25);
        System.out.println("Reciprocal of dOb is " +
                dOb.reciprocal());
        System.out.println("Fractional component of dOb is " +
                dOb.fraction());

        // Essa parte não será compilada porque String
        // não é subclasse de Number.
        // NumericFns2<String> strOb = new NumericFns2<String>("Error");
    }
}
