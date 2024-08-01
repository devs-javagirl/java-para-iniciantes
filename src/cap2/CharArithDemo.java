package cap2;

// Variáveis de caracteres podem ser tratadas como inteiros.
class CharArithDemo {
    public static void main(String args[]) {
        char ch;
        ch = 'X';
        System.out.println("ch contains " + ch);
        ch++; // incrementa ch
        System.out.println("ch is now " + ch);
        ch = 90; // dá a ch o valor Z
        System.out.println("ch is now " + ch);
    }
}
