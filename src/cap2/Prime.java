package cap2;

public class Prime {
    public static void main(String args[]) {
        int i, j;
        boolean isprime;
        for(i=2; i < 100; i++) {
            isprime = true;
            // v� se o n�mero tem divis�o exata
            for(j=2; j <= i/j; j++)
                // se tiver, n�o � primo
                if((i%j) == 0) isprime = false;
            if(isprime)
                System.out.println(i + " is prime.");
        }
    }
}
