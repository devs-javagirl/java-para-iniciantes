package cap2;

public class Literais {

    /*
    Tabela de Sequências de Escape:
    \': Aspas simples
    \": Aspas duplas
    \: Barra invertida
    \r: Retorno de carro
    \n: Nova linha
    \f: Avanço de página
    \t: Tabulação horizontal
    \b: Retrocesso
    \ddd: Constante octal
    \Uxxxx: Constante hexadecimal
    */

    public static void variaveis(){
        char k = 'A';
        String ka = "A";
        System.out.println("char k = " + k);
        System.out.println("String ka = " + ka);
    }
    public static void main(String[] args) {

        variaveis();

        //sequências de escape
        System.out.print("First line\nSecond line");
        System.out.print("\nA\tB\tC\n");

        //outros exemplos
        System.out.println("Uma frase simples com aspas simples: \' X \'");
        System.out.println("Uma frase simples com aspas duplas: \" X \"");
        System.out.println("Uma frase simples com barra invertida: \\ X \\");
        System.out.println("Uma frase simples com nova linha: \n X \n");
        System.out.println("Uma frase simples com avanço de página: \f X \f");
        System.out.println("Uma frase simples com tabulação horizontal: \t X \t");
        System.out.println("Uma frase simples com retrocesso: \b X \b");
        System.out.println("Uma frase simples com constante octal: \101 X \101");
        System.out.println("Uma frase simples com constante hexadecimal: \u0041 X \u0041");

        //System.out.println("Uma frase simples com retorno de carro: \r X \r");

    }

}
