package cap6;

class StaticError {
    static int denom = 3; // retirar static torna variável de instância comum
    static int val = 1024; // variável estática

    // Erro! Método estático não pode acessar variável de instância
    static int valDivDenom() {
        return val / denom; // não será compilado!
    }
}

