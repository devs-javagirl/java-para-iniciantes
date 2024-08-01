package cap3;

// Outro exemplo do uso de break com um rótulo.
class Break5 {
    public static void main(String args[]) {
        done:
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    System.out.println(k + " ");
                    if(k == 5)
                        break done; // desvia para done
                }
                System.out.println("After k loop"); // não será executado
            }
            System.out.println("After j loop"); // não será executado
        }
        System.out.println("After i loop");
    }
}
