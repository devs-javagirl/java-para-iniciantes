package cap3;

// Declara a vari�vel de controle de la�o dentro de for.
class ForVar {
    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;
        int i;
        // calcula o fatorial dos n�meros at� 5
        for(i = 1; i <= 5; i++) {
            sum += i; // i � conhecida em todo o la�o
            fact *= i;
        }
        // mas n�o � conhecida aqui
        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
        System.out.println("Value of i is " + i);
    }
}
