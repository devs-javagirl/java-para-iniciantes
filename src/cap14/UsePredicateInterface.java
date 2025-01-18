package cap14;

// Usa a interface funcional interna Predicate.
// Importa a interface Predicate.
import java.util.function.Predicate;

class UsePredicateInterface {
    public static void main(String args[]) {
    // Esta expressão lambda usa Predicate<Integer> para
    // determinar se um número é par.
        Predicate<Integer> isEven = (n) -> (n %2) == 0;

        if(isEven.test(4))
            System.out.println("4 is even");

        if(!isEven.test(5))
            System.out.println("5 is odd");
    }
}
