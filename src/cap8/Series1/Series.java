package cap8.Series1;

public interface Series {
    int getNext(); // Retorna o próximo número da série.
    void reset();  // Reinicia a série.
    void setStart(int x); // Define o valor inicial da série.

    //int[] getNextArray(int n);
    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for(int i=0; i < n; i++)
            vals[i] = getNext();
        return vals;
    }
}
