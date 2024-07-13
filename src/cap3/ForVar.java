package cap3;

// Declara a variável de controle de laço dentro de for.
class ForVar {
    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;
        int i;
        // calcula o fatorial dos números até 5
        for(i = 1; i <= 5; i++) {
            sum += i; // i é conhecida em todo o laço
            fact *= i;
        }
        // mas não é conhecida aqui
        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
        System.out.println("Value of i is " + i);
    }
}
