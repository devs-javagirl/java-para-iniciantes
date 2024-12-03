package cap12;

// Usa um construtor, uma variável de instância e um método com a enumeração.
enum Transport3 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); //Observe os valores de inicialização.

    //Adiciona uma variável de instância
    private int speed; // velocidade típica de cada meio de transporte

    // Construtor
    Transport3(int s) { speed = s; }

    int getSpeed() { return speed; }

    // Sobrecarga do construtor com 2 parâmetros
    Transport3(int s, String description) {
        this.speed = s;
        System.out.println("Description: " + description);
    }
}

public class EnumDemo3 {
    public static void main(String args[])
    {
        Transport3 tp;
        // Exibe a velocidade de um avião.
        System.out.println("Typical speed for an airplane is " +
                Transport3.AIRPLANE.getSpeed() +
                " miles per hour.\n");

        //Obtém a velocidade chamando getSpeed( ).
        // Exibe todos os meios de transporte e velocidades.
        System.out.println("All Transport speeds: ");
        for(Transport3 t : Transport3.values())
            System.out.println(t + " typical speed is " +
                    t.getSpeed() +
                    " miles per hour.");
    }
}
