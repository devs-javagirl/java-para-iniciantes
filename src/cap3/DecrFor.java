package cap3;

// Um la�o for sendo executado em sentido negativo.
class DecrFor {
    public static void main(String args[]) {
        int x;
        for(x = 100; x > -100; x -= 5) {
            System.out.println(x);
        }

        int count;
        for(count=10; count < 5; count++) {
            x += count; // Esta instru��o n�o ser� executada
            System.out.println("count � " + count);
        }
    }
}
