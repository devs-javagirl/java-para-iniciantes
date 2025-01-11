package cap14;

// Interface funcional genérica com um parâmetro e um retorno
interface NumericFunc2<T> {
    T apply(T n);
}

public class GenericNumericFuncDemo {
    public static void main(String[] args) {
        // Lambda para calcular o quadrado de um número inteiro
        NumericFunc2<Integer> square = (n) -> n * n;
        System.out.println("Quadrado de 5: " + square.apply(5)); // Saída: 25

        // Lambda para calcular o quadrado de um número Double
        NumericFunc2<Double> squareDouble = (n) -> n * n;
        System.out.println("Quadrado de 3.14: " + squareDouble.apply(3.14)); // Saída: 9.8596

        // Lambda para verificar se um número é par (retorna "Par" ou "Ímpar")
        NumericFunc2<Integer> isEven = (n) -> (n % 2 == 0) ? n  :  -1;
        System.out.println("Resultado Numero pares de : Resultado com multiplos valores "  + isEven.apply(15)) ;

    }
}

