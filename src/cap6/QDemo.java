package cap6;

class QDemo {
    public static void main(String[] args) {
        // Cria uma fila de tamanho 10
        Queue q = new Queue(10);

        // Insere alguns caracteres na fila
        q.put('A');
        q.put('B');
        q.put('C');

        // Obtém e exibe os caracteres da fila
        System.out.println("Conteúdo da fila:");
        for (int i = 0; i < 3; i++) {
            System.out.println(q.get());
        }

        // Tenta inserir mais caracteres além da capacidade da fila
        for (int i = 0; i < 12; i++) {
            q.put((char) ('A' + i));
        }

        // Exibe o conteúdo da fila novamente após a tentativa de inserção
        System.out.println("\nConteúdo da fila após tentar inserir além da capacidade:");
        for (int i = 0; i < 10; i++) {
            System.out.println(q.get());
        }

        // Código comentado abaixo causaria erro de compilação devido aos membros privados
        // Queue test = new Queue(10);
        // test.q[0] = 99;       // Erro! Acesso ao array q não permitido
        // test.putloc = -100;   // Erro! Acesso ao índice putloc não permitido
    }
}

