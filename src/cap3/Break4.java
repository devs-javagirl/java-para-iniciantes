package cap3;

// Usando break com um rótulo.
class Break4 {
    public static void main(String args[]) {
        int i;
        for(i=1; i<4; i++) {
            one:  {
                two:  {
                    three:  {
                        System.out.println("\n i is " + i);
                        if(i==1)
                            break one;  //Break com um rotulo - vai para o fim do bloco
                        if(i==2)
                            break two;
                        if(i==3)
                            break three;

                        // essa parte nunca sera alcançada
                        System.out.println("won't print");
                    }
                    System.out.println("After block three.");
                }
                System.out.println("After block two.");
            }
            System.out.println("After block one.");
        }
        System.out.println("After for.");
    }
}
