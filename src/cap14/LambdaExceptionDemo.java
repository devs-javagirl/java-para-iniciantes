package cap14;

import java.io.*;

interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}

class LambdaExceptionDemo {
    public static void main(String args[]) {
        // Esta lambda de bloco pode lan�ar uma IOException.
        // A cl�usula throws deve estar presente em ioAction().
        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read(); // Pode lan�ar IOException
            // L�gica adicional pode ser inserida aqui
            return true;
        };
    }
}
