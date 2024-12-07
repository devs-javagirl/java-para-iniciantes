package cap12;

// Usa os m�todos de enumera��o internos.
// Enumera��o de meios de transporte.
enum Transport2 {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
class EnumDemo2 {
    public static void main(String args[])
    {
        Transport2 tp;

        System.out.println("Here are all Transport constants");
        // usa values()
        Transport2 allTransports[] = Transport2.values(); // Obt�m um array de constantes Transport.

        for(Transport2 t : allTransports)
            System.out.println(t);
        System.out.println();

        // usa valueOf()
        tp = Transport2.valueOf("AIRPLANE"); //Obt�m a constante de nome AIRPLANE.
        System.out.println("tp value = " + tp);
    }
}
