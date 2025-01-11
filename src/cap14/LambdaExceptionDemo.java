package cap14;

import java.io.*;

interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}

class LambdaExceptionDemo {
    public static void main(String args[]) {
        // Esta lambda de bloco pode lançar uma IOException.
        // A cláusula throws deve estar presente em ioAction().
        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read(); // Pode lançar IOException
            // Lógica adicional pode ser inserida aqui
            return true;
        };
    }
}
