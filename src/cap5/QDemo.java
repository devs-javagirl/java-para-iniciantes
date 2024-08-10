package cap5;

class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);

        // Armazena o alfabeto em bigQ
        for(int i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // Recupera e exibe os elementos de bigQ
        System.out.print("Contents of bigQ: ");
        for(int i = 0; i < 26; i++) {
            char ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\nUsing smallQ to generate errors.");

        // Tenta armazenar mais elementos do que smallQ pode suportar
        for(int i = 0; i < 5; i++) {
            smallQ.put((char) ('Z' - i));
        }

        // Recupera e exibe os elementos de smallQ
        System.out.print("Contents of smallQ: ");
        for(int i = 0; i < 5; i++) {
            char ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
    }
}

