package cap4;

import cap8.IVehicle;

public class Vehicle implements IVehicle {
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
    public int range() {
        return mpg * fuelcap;
    }

    // Calcula o combust�vel necess�rio para cobrir uma determinada dist�ncia.
    public double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    @Override
    public int getPassengers() {
        return 0;
    }

    @Override
    public void setPassengers(int p) {

    }

    @Override
    public int getFuelcap() {
        return 0;
    }

    @Override
    public void setFuelcap(int f) {

    }

    @Override
    public int getMpg() {
        return 0;
    }

    @Override
    public void setMpg(int m) {

    }

}
