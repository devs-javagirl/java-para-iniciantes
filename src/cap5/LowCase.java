package cap5;

class LowCase {
    public static void main(String args[]) {
        //Transformar letras mai�sculas em min�sculas ativando o 6� bit
        char ch;
        for(int i = 0; i < 26; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
            ch = (char) ((int) ch | 32); // Agora ch � min�scula
            System.out.print(ch + " ");
        }
    }
}

