package cap4;

public class ToyMain {
    public static void main(String[] args) {
        // Usando o operador new para criar inst�ncias da classe Toy
        Toy toy1 = new Toy("Car", "Car", 14.99);
        Toy toy2 = new Toy("Doll", "Stuffed", 19.99);

        // Exibindo as informa��es dos brinquedos
        System.out.println("Details of Toy 1:");
        toy1.displayInfo();

        System.out.println("\nDetails of Toy 2:");
        toy2.displayInfo();

        // Gerando muitos objetos para for�ar a coleta de lixo
        for (int i = 0; i < 1000; i++) {
            new Toy("Toy" + i, "Type" + i, i);
        }

        // Sugerindo a coleta de lixo
        System.gc();

        System.out.println("Program finished.");
    }
}
