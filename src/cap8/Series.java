package cap8;


public interface Series {
    int getNext(); // Retorna o pr�ximo n�mero da s�rie.

    // M�todo padr�o que retorna um array com os pr�ximos n n�meros.
    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for(int i = 0; i < n; i++) {
            vals[i] = getNext();
        }
        return vals;
    }

    void reset(); // Reinicia a s�rie.
    void setStart(int x); // Define o valor inicial.
}

class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class SeriesDemo {
    public static void main(String args[]) {
        ByTwos ob = new ByTwos();
        int[] nextNums = ob.getNextArray(5);
        for(int n : nextNums) {
            System.out.print(n + " ");
        }
    }
}
