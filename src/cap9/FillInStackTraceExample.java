package cap9;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    // Sobrescreve o método fillInStackTrace para atualizar o rastreamento da pilha
    @Override
    public Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }
}

public class FillInStackTraceExample {
    public static void main(String[] args) {
        try {
            // Primeiro ponto onde a exceção é lançada
            throw new CustomException("Exception in main method");
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e);
            System.out.println("Original stack trace:");
            System.out.println(e.toString());
            System.out.println("-----");

            try {
                // Atualiza o rastreamento da pilha para o ponto atual
                throw (CustomException) e.fillInStackTrace();
            } catch (CustomException ex) {
                System.out.println("Updated stack trace after relaunch:");
                ex.printStackTrace();
            }
        }
    }
}

