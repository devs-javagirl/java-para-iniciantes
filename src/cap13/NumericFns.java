package cap13;

public class NumericFns<T> {
    T num;
    // Passa para o construtor uma refer�ncia
    // a um objeto num�rico.
    NumericFns(T n) {
        num = n;
    }

    /*

    // Retorna o rec�proco (� o inverso multiplicativo)
    double reciprocal() {
        return 1 / num.doubleValue(); // Erro!
    }
    // Retorna o componente fracion�rio.
    double fraction() {
        return num.doubleValue() - num.intValue(); // Erro!
    }
    // ...

    */
}
