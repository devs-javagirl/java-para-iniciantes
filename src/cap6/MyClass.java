package cap6;

class MyClass {
    private int alpha; // acesso privado
    public int beta;   // acesso público
    int gamma;         // acesso padrão (equivalente a public neste contexto)

    // Métodos para acessar alpha
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

