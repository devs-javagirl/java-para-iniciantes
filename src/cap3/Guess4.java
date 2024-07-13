package cap3;

// Adivinhe a letra do jogo, 4ª versão.
class Guess4 {
    public static void main(String args[]) throws java.io.IOException {
        char ch, ignore, answer = 'K';
        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.print("Can you guess it: ");
            // lê um caractere
            ch = (char) System.in.read();
            // descarta qualquer outro caractere do buffer de entrada
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
            if(ch == answer) System.out.println("** Right **");
            else {
                System.out.print("...Sorry, you're ");
                if(ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again!\n");
            }
        } while(answer != ch);
    }
}

