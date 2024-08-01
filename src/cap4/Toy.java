package cap4;

public class Toy {
    // Atributos da classe Toy
    String name;
    String type;
    double price;

    // Construtor da classe Toy
    Toy(String n, String t, double p) {
        name = n;
        type = t;
        price = p;
    }

    // M�todo para exibir informa��es do brinquedo
    void displayInfo() {
        System.out.printf("Toy Name: %s, Type: %s, Price: $%.2f%n", name, type, price);
    }

    // M�todo finalize chamado antes do objeto ser destru�do pelo coletor de lixo
    protected void finalize() {
        System.out.println("Finalizing Toy: " + name);
    }
}
