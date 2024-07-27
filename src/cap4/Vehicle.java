package cap4;

public class Vehicle {
    int passengers; // número de passageiros
    int fuelcap; // capacidade de armazenamento de combustível em galões
    int mpg; // consumo de combustível em milhas por galão

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

    // Calcula o combustível necessário para cobrir uma determinada distância.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

}
