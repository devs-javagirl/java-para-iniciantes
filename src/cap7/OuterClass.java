package cap7;

public class OuterClass {
    private static String staticMember = "Static Member";
    private String instanceMember = "Instance Member";

    // Classe aninhada estatica
    static class NestedStaticClass {
        void display() {
            // Acessa o membro estatico da classe externa
            System.out.println("Accessing static member: " + staticMember);

            // Nao pode acessar diretamente membros de instancia da classe externa
           //  System.out.println("Accessing instance member: " + instanceMember); // Erro de compilacao
        }
    }

    public static void main(String[] args) {
        // Cria uma instancia da classe aninhada estatica
        NestedStaticClass nested = new NestedStaticClass();
        nested.display();


        // Para acessar membros de instancia da classe externa,
        // eh necessario criar uma instancia da classe externa
        OuterClass outer = new OuterClass();
        System.out.println("Accessing instance member from outer class: " + outer.instanceMember);


    }
}
