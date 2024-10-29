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
            // Tentativa de saque acima do saldo dispon�vel para simular a exce��o
            sacar(saldo, 150.0);
        }
        catch (BankException exc) { // Depois, trata exce��es gerais de banco
            System.out.println("Erro banc�rio: " + exc.getMessage());
        }
       // catch (InsufficientFundsException exc) { // Primeiro, trata a exce��o mais espec�fica
        //    System.out.println("Erro: " + exc.getMessage());
       // }

    }

    public static void sacar(double saldo, double quantia) throws BankException {
        if (quantia > saldo) {
            throw new InsufficientFundsException("Saldo insuficiente para realizar o saque.");
            //throw new BankException("Erro BankException.");
        }
        // L�gica de saque caso o saldo seja suficiente
        System.out.println("Saque realizado com sucesso.");
    }
}
