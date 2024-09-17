package cap6;

// Demonstra a sobrecarga de métodos.
class Overload {
    void ovlDemo() { //Primeira versão
        System.out.println("No parameters");
    }

    // Sobrecarrega ovlDemo para um parâmetro inteiro.
    void ovlDemo(int a) { //Segunda versão
        System.out.println("One parameter: " + a);
    }

    int ovlDemo(double a) {
        System.out.println("One parameter double: " + a);
        return 10;
    }

    // Sobrecarrega ovlDemo para dois parâmetros inteiros.
    int ovlDemo(int a, int b) { // Terceira versão
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }
    // Sobrecarrega ovlDemo para dois parâmetros double.
    double ovlDemo(double a, double b) { //Quarta versão
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }

    /*
    // É correto usar um método ovlDemo(int).
    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    //Os tipos de retorno não podem ser usados para diferenciar métodos sobrecarregados.
    //Erro! Não é correto usar dois métodos ovlDemo(int) mesmo que os tipos de retorno sejam diferentes.

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
        // chama todas as versões de ovlDemo()
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

