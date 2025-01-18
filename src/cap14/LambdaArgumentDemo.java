package cap14;

interface StringFunc {
    String func(String str);
}

class LambdaArgumentDemo {
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]) {
        String inStr = "Lambda Expressions Expand Java";
        String outStr;
        String trimStr;
        System.out.println("Here is input string: " + inStr);

        // Express�o lambda para inverter a string
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        // Passando a express�o lambda 'reverse' para o m�todo
        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);

        // Express�o lambda para substituir espa�os por h�fens
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);

        // Express�o lambda para inverter a caixa das letras
        outStr = changeStr((str) -> {
            String result = "";
            char ch;
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);
        System.out.println("The string in reversed case: " + outStr);

        // Express�o lambda para substituir espa�os por h�fens
        trimStr = changeStr((str) -> str.replaceAll(" ",""), inStr);
        System.out.println("The string with spaces trim: " + trimStr);

    }
}
