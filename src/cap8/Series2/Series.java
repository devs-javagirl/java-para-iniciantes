package cap8.Series2;

public interface Series {
    int getNext(); // retorna o proximo numero da serie
    // Retorna um array que contem os proximos
    // n elementos da serie apos o elemento atual.

    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for(int i=0; i < n; i++)
            vals[i] = getNext();
        return vals;
    }

    void reset(); // reinicia
    void setStart(int x); // define o valor inicial
}
