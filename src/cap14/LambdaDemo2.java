package cap14;

// Interface funcional que usa dois parâmetros int e
// retorna um resultado boolean.
interface NumericTest {
    boolean test(int n, int m);
}

class LambdaDemo2 {
    public static void main(String args[])
    {
        // Esta expressão lambda determina se um número
        // é fator de outro.
        NumericTest isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");

        if(!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");

        System.out.println();

        // Esta expressão lambda retorna true se o
        // primeiro argumento for menor do que o segundo.
        NumericTest lessThan = (n, m) -> (n < m);

        if(lessThan.test(2, 10))
            System.out.println("2 is less than 10");

        if(!lessThan.test(10, 2))
            System.out.println("10 is not less than 2");
        System.out.println();

        // Esta expressão lambda retorna true se os
        // valores absolutos dos argumentos forem iguais.
        NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        //está fazendo  -(-4) = 4

        if(absEqual.test(4, -4))
            System.out.println("Absolute values of 4 and -4 are equal.");

        if(!lessThan.test(4, -5))
            System.out.println("Absolute values of 4 and -5 are not equal.");

        System.out.println();
    }
}
