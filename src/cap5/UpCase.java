package cap5;

class UpCase {
    public static void main(String args[]) {
        char ch;
        for(int i = 0; i < 26; i++) {
            ch =  (char)('a' + i);
            System.out.print(ch);
            ch = (char) ((int) ch & 65503); // Agora ch � mai�scula
            System.out.print(ch + " ");
            System.out.println("em bin�rio " + Integer.toBinaryString(ch));

            /*
            Determinando se um Bit Est� Ativado
            Usando AND para verificar se o 4� bit est� ativado
         */
            if((i & 8) != 0)  {
                System.out.println("bit 4 is on");
            }
        }





    }
}

