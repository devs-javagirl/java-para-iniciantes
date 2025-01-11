package cap14;

// Interface funcional genérica com dois parâmetros que retorna um boolean
interface SomeTest<T> {
    boolean test(T n, T m);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Expressão lambda para verificar se um inteiro é fator de outro
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2)) {
            System.out.println("2 is a factor of 10");
        }

        // Expressão lambda para verificar se um Double é fator de outro
        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;
        if (isFactorD.test(212.0, 4.0)) {
            System.out.println("4.0 is a factor of 212.0");
        }

        // Expressão lambda para verificar se uma string faz parte de outra
        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;
        String str = "Generic Functional Interface";
        System.out.println("Testing string: " + str);
        if (isIn.test(str, "face")) {
            System.out.println("'face' is found.");
        } else {
            System.out.println("'face' not found.");
        }
    }
}
