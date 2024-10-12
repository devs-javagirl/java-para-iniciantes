package cap6;

// Demonstra a sobrecarga de m�todos.
class Overload {
    void ovlDemo() { //Primeira vers�o
        System.out.println("No parameters");
    }

    // Sobrecarrega ovlDemo para um par�metro inteiro.
    void ovlDemo(int a) { //Segunda vers�o
        System.out.println("One parameter: " + a);
    }

    int ovlDemo(double a) {
        System.out.println("One parameter double: " + a);
        return 10;
    }

    // Sobrecarrega ovlDemo para dois par�metros inteiros.
    int ovlDemo(int a, int b) { // Terceira vers�o
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }
    // Sobrecarrega ovlDemo para dois par�metros double.
    double ovlDemo(double a, double b) { //Quarta vers�o
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }

    /*
    // � correto usar um m�todo ovlDemo(int).
    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    //Os tipos de retorno n�o podem ser usados para diferenciar m�todos sobrecarregados.
    //Erro! N�o � correto usar dois m�todos ovlDemo(int) mesmo que os tipos de retorno sejam diferentes.

    int ovlDemo(int a) {
        System.out.println("One parameter: " + a);
        return a * a;
    }
    */
}

class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();
        int resI;
        double resD;
        // chama todas as vers�es de ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4, 6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
    }
}

