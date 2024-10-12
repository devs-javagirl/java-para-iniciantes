package cap8;


public interface Series {
    int getNext(); // Retorna o próximo número da série.

    // Método padrão que retorna um array com os próximos n números.
    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for(int i = 0; i < n; i++) {
            vals[i] = getNext();
        }
        return vals;
    }

    void reset(); // Reinicia a série.
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
