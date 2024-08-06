package cap4;

public class ObjectLifecycle {
    public static void main(String[] args) {
        // Estado Created (Criado)
        LifecycleObject obj = new LifecycleObject("MyObject");

        // Estado In Use (Em uso)
        obj.useObject();

        // Estado Invisible (Invis�vel)
        obj = null;

        // Solicitando a execu��o do coletor de lixo
        System.gc();

        // Estado Unreachable (Inalcan��vel) e Coletado (Coletado)
        // O estado Coletado ser� ap�s a execu��o do GC.
        // O estado Finalized ser� ilustrado atrav�s do m�todo finalize().
        // O estado Deallocated n�o � vis�vel diretamente no Java.
    }
}

class LifecycleObject {
    private String name;

    // Construtor: Ilustra o estado Created
    public LifecycleObject(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    // M�todo para ilustrar o estado In Use
    public void useObject() {
        System.out.println(name + " is in use.");
    }

    // M�todo finalize para ilustrar o estado Finalized
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being finalized.");
        super.finalize();
    }
}
