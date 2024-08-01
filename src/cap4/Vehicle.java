package cap4;

public class Vehicle {
    int passengers; // n�mero de passageiros
    int fuelcap; // capacidade de armazenamento de combust�vel em gal�es
    int mpg; // consumo de combust�vel em milhas por gal�o

    Vehicle() {
    }

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Retorna a autonomia.
    int range() {
        return mpg * fuelcap;
    }

    // Calcula o combust�vel necess�rio para cobrir uma determinada dist�ncia.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

}
