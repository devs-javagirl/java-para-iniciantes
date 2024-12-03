package cap12;

// Usa um construtor, uma vari�vel de inst�ncia e um m�todo com a enumera��o.
enum Transport3 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); //Observe os valores de inicializa��o.

    //Adiciona uma vari�vel de inst�ncia
    private int speed; // velocidade t�pica de cada meio de transporte

    // Construtor
    Transport3(int s) { speed = s; }

    int getSpeed() { return speed; }

    // Sobrecarga do construtor com 2 par�metros
    Transport3(int s, String description) {
        this.speed = s;
        System.out.println("Description: " + description);
    }
}

public class EnumDemo3 {
    public static void main(String args[])
    {
        Transport3 tp;
        // Exibe a velocidade de um avi�o.
        System.out.println("Typical speed for an airplane is " +
                Transport3.AIRPLANE.getSpeed() +
                " miles per hour.\n");

        //Obt�m a velocidade chamando getSpeed( ).
        // Exibe todos os meios de transporte e velocidades.
        System.out.println("All Transport speeds: ");
        for(Transport3 t : Transport3.values())
            System.out.println(t + " typical speed is " +
                    t.getSpeed() +
                    " miles per hour.");
    }
}
