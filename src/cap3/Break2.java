package cap3;

// L� a entrada at� um q ser recebido.
class Break2 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;

        for (; ; ) {  // Esse laco infinito eh encerrado por break.
            ch = (char) System.in.read(); // obt�m um char
            if (ch == 'q')
                break;
        }

        System.out.println("You pressed q!");
    }
}