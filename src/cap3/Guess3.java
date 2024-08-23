package cap3;

// Adivinhe a letra do jogo, 3a versão.
class Guess3 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read(); // obtém um char

        if(ch == answer) System.out.println("** Right **");
        else {
            System.out.print("...Sorry, you're ");
            // um if aninhado
            if(ch < answer)
                System.out.println("too low");
            else
                System.out.println("too high");
        }
    }
}
