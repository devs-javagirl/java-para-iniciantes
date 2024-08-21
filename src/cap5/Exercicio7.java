package cap5;

public class Exercicio7 {
    //Expandindo a classe de codificação Encode, modifique-a para que use um
    //string de oito caracteres como chave.

    public static void main(String args[]) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgi";

        int j;
        System.out.print("Original message: ");
        System.out.println(msg);

        // codifica a mensagem
        j = 0;
        for(int i=0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==8)
                j = 0;
        }
        System.out.print("Encoded message: ");
        System.out.println(encmsg);
        System.out.println("------------");

        // decodifica a mensagem
        j = 0;
        for(int i=0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==8)
                j = 0;
        }
        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
