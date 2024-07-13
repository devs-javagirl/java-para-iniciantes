package cap3;

// Um laço for sendo executado em sentido negativo.
class DecrFor {
    public static void main(String args[]) {
        int x;
        for(x = 100; x > -100; x -= 5) {
            System.out.println(x);
        }

        int count;
        for(count=10; count < 5; count++) {
            x += count; // Esta instrução não será executada
            System.out.println("count é " + count);
        }
    }
}
