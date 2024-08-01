package cap3;

// Usa continue.
class ContDemo {
    public static void main(String args[]) {
        int i;
        // exibe os números pares entre 0 e 100
        for(i = 0; i<=100; i++) {
            if((i%2) != 0){
                continue; // iterate
            }
            System.out.println(i);
        }
    }
}