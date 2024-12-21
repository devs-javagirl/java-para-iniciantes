package cap13.TenteIsso13;

//Tente Isto 13-1
//Demonstra uma classe genérica de fila.
class GenQDemo {
    public static void main(String args[]) {
        // Cria uma fila de inteiros.
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> qInteger = new GenQueue<Integer>(iStore);
        Integer iVal;

        System.out.println("Demonstrate a queue of Integers.");
        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + i + " to qInteger.");
                qInteger.put(i); // adiciona o valor inteiro à qInteger Código
            }
        }
        catch (QueueFullException2 exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            for(int i=0; i < 5; i++) {
                System.out.print("Getting next Integer from qInteger: ");
                iVal = qInteger.get();
                System.out.println(iVal);
            }
        }
        catch (QueueEmptyException2 exc) {
            System.out.println(exc);
        }

        System.out.println();

        // Cria uma fila Double.
        Double dStore[] = new Double[10];
        GenQueue<Double> qDouble = new GenQueue<Double>(dStore);
        Double dVal;
        System.out.println("Demonstrate a queue of Doubles.");
        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + (double)i/2 +
                        " to qDouble.");
                qDouble.put((double)i/2); // adiciona o valor double à qDouble
            }
        }
        catch (QueueFullException2 exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(int i=0; i < 5; i++) {
                System.out.print("Getting next Double from qDouble: ");
                dVal = qDouble.get();
                System.out.println(dVal);
            }
        }
        catch (QueueEmptyException2 exc) {
            System.out.println(exc);
        }
    }
}
