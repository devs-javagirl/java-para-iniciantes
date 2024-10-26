package cap9;

class QExcDemo {
    public static void main(String args[]) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;
        try {
            //empilhando 11 caracteres
            for(i=0; i < 11; i++) {
                System.out.print("Attempting to store : " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        try {
            //desempilhando 11 caracteres
            for(i=0; i < 11; i++) {
                System.out.print("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
