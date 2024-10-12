package cap4;

import cap8.IVehicle;

public class Vehicle implements IVehicle {
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
    public int range() {
        return mpg * fuelcap;
    }

    // Calcula o combustível necessário para cobrir uma determinada distância.
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
