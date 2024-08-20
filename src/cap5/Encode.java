package cap5;

class Encode {
    public static void main(String args[]) {
        //XOR ativa um bit apenas se os bits comparados forem diferentes.
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;
        System.out.print("Original message: ");
        System.out.println(msg);

        // Codifica a mensagem
        for(int i = 0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // Decodifica a mensagem
        for(int i = 0; i < msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}

