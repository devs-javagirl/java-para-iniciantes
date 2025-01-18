package cap14;

// Demonstra uma refer�ncia a um m�todo est�tico.
// Interface funcional para predicados num�ricos que opera com
// valores inteiros.
interface IntPredicate {
    boolean test(int n);
}

// Esta classe define tr�s m�todos est�ticos que verificam um inteiro
// em rela��o a alguma condi��o.
class MyIntPredicates {
    // Um m�todo est�tico que retorna true quando um n�mero � primo.
    //numero primo � quando o numero � divis�vel por 1 e por ele mesmo.
    static boolean isPrime(int n) {
        if(n < 2)
            return false;

        for(int i=2; i <= n/i; i++) {
            if((n % i) == 0)
                return false;
        }
        return true;
    }

    // Um m�todo est�tico que retorna true quando um n�mero � par.
    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    // Um m�todo est�tico que retorna true quando um n�mero � positivo.
    static boolean isPositive(int n) {
        return n > 0;
    }
}

class MethodRefDemo {
    // Este m�todo tem uma interface funcional como tipo de seu
    // primeiro par�metro. Logo, pode receber uma refer�ncia a
    // qualquer inst�ncia dessa interface, inclusive uma criada
    // por uma refer�ncia de m�todo.
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String args[]) {
        boolean result;
        // Aqui, uma refer�ncia ao m�todo isPrime � passada para numTest().
        result = numTest(MyIntPredicates::isPrime, 17);
        if(result)
            System.out.println("17 is prime.");

        // Em seguida, uma refer�ncia ao m�todo isEven � usada.
        result = numTest(MyIntPredicates::isEven, 12);
        if(result)
            System.out.println("12 is even.");

        // Agora, uma refer�ncia ao m�todo isPositive � passada.
        result = numTest(MyIntPredicates::isPositive, 11);
        if(result)
            System.out.println("11 is positive.");
    }
}
