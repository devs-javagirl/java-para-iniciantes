package cap3;

// Demonstra o laço do-while.
class DWDemo {
    public static void main(String args[]) throws java.io.IOException {
        char ch;
        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read(); // obtém um char
        } while(ch != 'q');
    }
}
