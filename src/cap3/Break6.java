package cap3;

// � importante onde o r�tulo � inserido.
class Break6 {
    public static void main(String args[]) {
        int x=0, y=0;
        // aqui, insira o r�tulo antes da instru��o for.
        stop1: for(x=0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2)
                    break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }

        System.out.println();
        // agora, insira o r�tulo imediatamente antes de {
        for(x=0; x < 5; x++)
            stop2: {
                for(y = 0; y < 5; y++) {
                    if(y == 2)
                        break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
    }
}

