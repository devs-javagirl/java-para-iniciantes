package cap12;

// Usa os métodos de enumeração internos.
// Enumeração de meios de transporte.
enum Transport2 {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
class EnumDemo2 {
    public static void main(String args[])
    {
        Transport2 tp;

        System.out.println("Here are all Transport constants");
        // usa values()
        Transport2 allTransports[] = Transport2.values(); // Obtém um array de constantes Transport.

        for(Transport2 t : allTransports)
            System.out.println(t);
        System.out.println();

        // usa valueOf()
        tp = Transport2.valueOf("AIRPLANE"); //Obtém a constante de nome AIRPLANE.
        System.out.println("tp value = " + tp);
    }
}
