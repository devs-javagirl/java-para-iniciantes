package cap13;

public class NumericFns<T> {
    T num;
    // Passa para o construtor uma referência
    // a um objeto numérico.
    NumericFns(T n) {
        num = n;
    }

    /*

    // Retorna o recíproco (é o inverso multiplicativo)
    double reciprocal() {
        return 1 / num.doubleValue(); // Erro!
    }
    // Retorna o componente fracionário.
    double fraction() {
        return num.doubleValue() - num.intValue(); // Erro!
    }
    // ...

    */
}
