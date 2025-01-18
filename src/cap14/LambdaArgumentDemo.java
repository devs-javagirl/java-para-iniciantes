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

        // Expressão lambda para inverter a string
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        // Passando a expressão lambda 'reverse' para o método
        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);

        // Expressão lambda para substituir espaços por hífens
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);

        // Expressão lambda para inverter a caixa das letras
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

        // Expressão lambda para substituir espaços por hífens
        trimStr = changeStr((str) -> str.replaceAll(" ",""), inStr);
        System.out.println("The string with spaces trim: " + trimStr);

    }
}
