package cap6;

class QDemo {
    public static void main(String[] args) {
        // Cria uma fila de tamanho 10
        Queue q = new Queue(10);

        // Insere alguns caracteres na fila
        q.put('A');
        q.put('B');
        q.put('C');

        // Obt�m e exibe os caracteres da fila
        System.out.println("Conte�do da fila:");
        for (int i = 0; i < 3; i++) {
            System.out.println(q.get());
        }

        // Tenta inserir mais caracteres al�m da capacidade da fila
        for (int i = 0; i < 12; i++) {
            q.put((char) ('A' + i));
        }

        // Exibe o conte�do da fila novamente ap�s a tentativa de inser��o
        System.out.println("\nConte�do da fila ap�s tentar inserir al�m da capacidade:");
        for (int i = 0; i < 10; i++) {
            System.out.println(q.get());
        }

        // C�digo comentado abaixo causaria erro de compila��o devido aos membros privados
        // Queue test = new Queue(10);
        // test.q[0] = 99;       // Erro! Acesso ao array q n�o permitido
        // test.putloc = -100;   // Erro! Acesso ao �ndice putloc n�o permitido
    }
}

