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

    // Método para exibir informações do brinquedo
    void displayInfo() {
        System.out.printf("Toy Name: %s, Type: %s, Price: $%.2f%n", name, type, price);
    }

    // Método finalize chamado antes do objeto ser destruído pelo coletor de lixo
    protected void finalize() {
        System.out.println("Finalizing Toy: " + name);
    }
}
