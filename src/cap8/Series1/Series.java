package cap8.Series1;

public interface Series {
    int getNext(); // Retorna o pr�ximo n�mero da s�rie.
    void reset();  // Reinicia a s�rie.
    void setStart(int x); // Define o valor inicial da s�rie.

    //int[] getNextArray(int n);
    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for(int i=0; i < n; i++)
            vals[i] = getNext();
        return vals;
    }
}
