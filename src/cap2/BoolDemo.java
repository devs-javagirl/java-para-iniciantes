package cap2;

// Demonstra valores booleanos.
class BoolDemo {
    public static void main(String args[]) {
        boolean b;

        b = false;
        System.out.println("b is " + b);

        b = true;
        System.out.println("b is " + b);

        // um valor booleano pode controlar a instru��o if
        if(b)
            System.out.println("This is executed.");

        b = false;
        if(b)
            System.out.println("This is not executed.");

        // o resultado de um operador relacional � um valor booleano
        System.out.println("10 > 9 is " + (10 > 9));
    }
}