package cap6;

class MyClass {
    private int alpha; // acesso privado
    public int beta;   // acesso p�blico
    int gamma;         // acesso padr�o (equivalente a public neste contexto)

    // M�todos para acessar alpha
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

