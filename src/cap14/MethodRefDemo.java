package cap14;

// Demonstra uma referência a um método estático.
// Interface funcional para predicados numéricos que opera com
// valores inteiros.
interface IntPredicate {
    boolean test(int n);
}

// Esta classe define três métodos estáticos que verificam um inteiro
// em relação a alguma condição.
class MyIntPredicates {
    // Um método estático que retorna true quando um número é primo.
    //numero primo é quando o numero é divisível por 1 e por ele mesmo.
    static boolean isPrime(int n) {
        if(n < 2)
            return false;

        for(int i=2; i <= n/i; i++) {
            if((n % i) == 0)
                return false;
        }
        return true;
    }

    // Um método estático que retorna true quando um número é par.
    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    // Um método estático que retorna true quando um número é positivo.
    static boolean isPositive(int n) {
        return n > 0;
    }
}

class MethodRefDemo {
    // Este método tem uma interface funcional como tipo de seu
    // primeiro parâmetro. Logo, pode receber uma referência a
    // qualquer instância dessa interface, inclusive uma criada
    // por uma referência de método.
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String args[]) {
        boolean result;
        // Aqui, uma referência ao método isPrime é passada para numTest().
        result = numTest(MyIntPredicates::isPrime, 17);
        if(result)
            System.out.println("17 is prime.");

        // Em seguida, uma referência ao método isEven é usada.
        result = numTest(MyIntPredicates::isEven, 12);
        if(result)
            System.out.println("12 is even.");

        // Agora, uma referência ao método isPositive é passada.
        result = numTest(MyIntPredicates::isPositive, 11);
        if(result)
            System.out.println("11 is positive.");
    }
}
