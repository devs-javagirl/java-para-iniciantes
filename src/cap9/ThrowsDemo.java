package cap9;

class ThrowsDemo {
    public static char prompt()
            throws java.io.IOException { //Observe a cl�usula throws.
        System.out.print("Enter a letter: ");
        return (char) System.in.read();
    }

    public static void main(String args[]) {
        char ch;
        try {
            ch = prompt();
        }
        catch(java.io.IOException exc) {
           /* J� que o m�todo prompt( ) pode
            lan�ar uma exce��o, uma chamada a
            ele deve ser inserida em um bloco try.
            */
            System.out.println("I/O exception occurred.");
            ch = 'X';
        }
        System.out.println("You pressed " + ch);
    }
}