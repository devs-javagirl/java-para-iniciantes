package cap4;

public class Finalize {
    public static void main(String args[]) {
        int count;
        FDemo ob = new FDemo(0);

    /* Agora, gere um grande numero de objetos.
       Em algum momento, a coleta de lixo ocorrera.
       Nota: voce pode ter de aumentar o numero
       de objetos gerados para forcar a
       coleta de lixo. */
        for(count=1; count < 1000000; count++)
            ob.generator(count);
    }
}
