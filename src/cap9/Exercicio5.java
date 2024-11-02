package cap9;

class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends BankException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Exercicio5 {
    public static void main(String[] args) {
        double saldo = 100.0;

        try {
            // Tentativa de saque acima do saldo disponível para simular a exceção
            sacar(saldo, 150.0);
        }
        catch (BankException exc) { // Depois, trata exceções gerais de banco
            System.out.println("Erro bancário: " + exc.getMessage());
        }
       // catch (InsufficientFundsException exc) { // Primeiro, trata a exceção mais específica
        //    System.out.println("Erro: " + exc.getMessage());
       // }

    }

    public static void sacar(double saldo, double quantia) throws BankException {
        if (quantia > saldo) {
            throw new InsufficientFundsException("Saldo insuficiente para realizar o saque.");
            //throw new BankException("Erro BankException.");
        }
        // Lógica de saque caso o saldo seja suficiente
        System.out.println("Saque realizado com sucesso.");
    }
}
