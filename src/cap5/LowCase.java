package cap5;

class LowCase {
    public static void main(String args[]) {
        //Transformar letras maiúsculas em minúsculas ativando o 6º bit
        char ch;
        for(int i = 0; i < 26; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
            ch = (char) ((int) ch | 32); // Agora ch é minúscula
            System.out.print(ch + " ");
        }
    }
}

