package cap12;

// Demonstra ordinal() e compareTo().
// Enumeração de meios de transporte.
enum Transport4 {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
class EnumDemo4 {
    public static void main(String args[])
    {
        Transport4 tp, tp2, tp3;

        // Obtém todos os valores ordinais usando ordinal().
        System.out.println("Here are all Transport constants" +
                " and their ordinal values: ");
        for(Transport4 t : Transport4.values())
            System.out.println(t + " " + t.ordinal()); //Obtém os valores ordinais.

        tp = Transport4.AIRPLANE; //2
        tp2 = Transport4.TRAIN; //3
        tp3 = Transport4.AIRPLANE; //2
        System.out.println();

        // Demonstra compareTo()
        if(tp.compareTo(tp2) < 0) //Compara valores ordinais
            System.out.println(tp + " comes before " + tp2);
        if(tp.compareTo(tp2) > 0)
            System.out.println(tp2 + " comes before " + tp);
        if(tp.compareTo(tp3) == 0)
            System.out.println(tp + " equals " + tp3);
    }
}