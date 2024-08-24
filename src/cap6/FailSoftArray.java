package cap6;

class FailSoftArray {
    private int a[];       // refer�ncia ao array (privado)
    private int errval;    // valor retornado em caso de falha (privado)
    public int length;     // tamanho do array (p�blico)

    // Construtor para inicializar o array e o valor de erro
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Retorna o valor no �ndice especificado
    public int get(int index) {
        if(indexOK(index)) return a[index];
        return errval;
    }

    // Insere um valor em um �ndice, retorna false em caso de falha
    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // Verifica se o �ndice est� dentro dos limites
    private boolean indexOK(int index) {
        if(index >= 0 & index < length) return true;
        return false;
    }
}

