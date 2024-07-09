package cap2;

public class Prime {
    public static void main(String args[]) {
        int i, j;
        boolean isprime;
        for(i=2; i < 100; i++) {
            isprime = true;
            // vê se o número tem divisão exata
            for(j=2; j <= i/j; j++)
                // se tiver, não é primo
                if((i%j) == 0) isprime = false;
            if(isprime)
                System.out.println(i + " is prime.");
        }
    }
}
