package cap4;

public class ObjectLifecycle {
    public static void main(String[] args) {
        // Estado Created (Criado)
        LifecycleObject obj = new LifecycleObject("MyObject");

        // Estado In Use (Em uso)
        obj.useObject();

        // Estado Invisible (Invisível)
        obj = null;

        // Solicitando a execução do coletor de lixo
        System.gc();

        // Estado Unreachable (Inalcançável) e Coletado (Coletado)
        // O estado Coletado será após a execução do GC.
        // O estado Finalized será ilustrado através do método finalize().
        // O estado Deallocated não é visível diretamente no Java.
    }
}

class LifecycleObject {
    private String name;

    // Construtor: Ilustra o estado Created
    public LifecycleObject(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    // Método para ilustrar o estado In Use
    public void useObject() {
        System.out.println(name + " is in use.");
    }

    // Método finalize para ilustrar o estado Finalized
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being finalized.");
        super.finalize();
    }
}
