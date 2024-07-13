package cap3;

// Calcula as potências inteiras de 2.
class Power {
    public static void main(String args[]) {
        int e;
        int result;
        for(int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while(e > 10) { // enquanto e for maior que 0
                result *= 2; // multiplica result por 2
                e--; // decrementa e
            }
            System.out.println("2 to the " + i + " power is " + result);
        }
    }
}
