package cap2;

// Os efeitos colaterais podem ser importantes.
class SideEffects {
    public static void main(String args[]) {
        int i;
        i = 0;
 /* Aqui, i � incrementada mesmo que a
 instru��o if seja falsa. */
        if(false & (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); // exibe 1
 /* Nesse caso, i n�o � incrementada porque o
 operador de curto-circuito ignora o incremento. */

        if(false && (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); // continua
        //exibindo 1 !!
    }
}
