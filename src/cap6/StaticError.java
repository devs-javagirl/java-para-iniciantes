package cap6;

class StaticError {
    static int denom = 3; // retirar static torna vari�vel de inst�ncia comum
    static int val = 1024; // vari�vel est�tica

    // Erro! M�todo est�tico n�o pode acessar vari�vel de inst�ncia
    static int valDivDenom() {
        return val / denom; // n�o ser� compilado!
    }
}

