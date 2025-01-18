package cap14;

// Uma lambda de bloco que encontra o menor fator positivo
// de um valor int.
interface NumericFunc {
    int func(int n);
}

interface MyFunc1<T> {
    T func(T n);
}

class BlockLambdaDemo {
    public static void main(String args[])
    {
        // Esta lambda de bloco retorna o menor fator positivo de um valor.
        // Uma expressão lambda de bloco

        NumericFunc smallestF = (n) -> {
            int result = 1;

            // Obtém o valor absoluto de n.
            n = n < 0 ? -n : n;

            for(int i=2; i <= n/i; i++)
                if((n % i) == 0) {
                    result = i;
                    break;
                }

            return result;
        };

        System.out.println("Smallest factor of 12 is " + smallestF.func(12));
        System.out.println("Smallest factor of 11 is " + smallestF.func(11));

        NumericFunc numFunc = (numF) -> {
            int result=1;
            for(int i=1; i<=numF; i++){
                result = result * i;
            }
            return result;
        };

        System.out.println("The factorial of 3 is " + numFunc.func(3));
        System.out.println("The factorial of 3 is " + numFunc.func(5));
        System.out.println("The factorial of 5 is " + numFunc.func(9));

        MyFunc1<Integer> numFunc1 = (numF) -> {
            int result=1;
            for(int i=1; i<=numF; i++){
                result = result * i;
            }
            return result;
        };

        System.out.println("The factorial of 3 is " + numFunc1.func(3));
        System.out.println("The factorial of 3 is " + numFunc1.func(5));
        System.out.println("The factorial of 5 is " + numFunc1.func(9));
    }
}
