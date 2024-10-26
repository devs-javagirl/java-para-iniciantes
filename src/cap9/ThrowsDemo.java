package cap9;

class ThrowsDemo {
    public static char prompt()
            throws java.io.IOException { //Observe a cláusula throws.
        System.out.print("Enter a letter: ");
        return (char) System.in.read();
    }

    public static void main(String args[]) {
        char ch;
        try {
            ch = prompt();
        }
        catch(java.io.IOException exc) {
           /* Já que o método prompt( ) pode
            lançar uma exceção, uma chamada a
            ele deve ser inserida em um bloco try.
            */
            System.out.println("I/O exception occurred.");
            ch = 'X';
        }
        System.out.println("You pressed " + ch);
    }
}