package cap2;

class ScopeDemo {
    public static void main(String args[]) {
        int x = 10; // conhecida pelo código dentro de main()

        if(x == 10) { // inicia novo escopo
            int y = 20; // conhecida apenas nesse bloco
            // tanto x quanto y são conhecidas aqui
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }

        // y = 100; // Erro! y não é conhecida aqui
        // x ainda é conhecida aqui
        System.out.println("x is " + x);
    }
}

