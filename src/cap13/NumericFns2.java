package cap13;

public class NumericFns2<T extends Number> {
    T num;
    // Passa para o construtor uma refer�ncia a um objeto num�rico.
    NumericFns2(T n) {
        num = n;
    }
    // Retorna o rec�proco.
    double reciprocal() {
        return 1 / num.doubleValue();
    }
    // Retorna o componente fracion�rio.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    ///usado no Example1.java
    // Este c�digo n�o funcionar�!
    // Determina se os valores absolutos de dois objetos s�o iguais.
    boolean absEqual(NumericFns2<T> ob) {
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;

        return false;
    }
}


class BoundsDemo {
    public static void main(String args[]) {
        // Integer pode ser usado porque � subclasse de Number.
        NumericFns2<Integer> iOb =
                new NumericFns2<Integer>(5);
        System.out.println("Reciprocal of iOb is " +
                iOb.reciprocal());
        System.out.println("Fractional component of iOb is " +
                iOb.fraction());
        System.out.println();

        // Double tamb�m pode ser usado.
        NumericFns2<Double> dOb =
                new NumericFns2<Double>(5.25);
        System.out.println("Reciprocal of dOb is " +
                dOb.reciprocal());
        System.out.println("Fractional component of dOb is " +
                dOb.fraction());

        // Essa parte n�o ser� compilada porque String
        // n�o � subclasse de Number.
        // NumericFns2<String> strOb = new NumericFns2<String>("Error");
    }
}
