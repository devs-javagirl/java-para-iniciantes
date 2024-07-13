package cap3;

// Executa o laço até um S ser digitado.
class ForTest {
    /**
     * TODO porque ele executa 2x println dentro do for?
     */
    public static void main(String args[])
            throws java.io.IOException {
        int i;
        System.out.println("Press S to stop.");

        for(i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Pass #" + i);
        }
    }
}
