package cap8;

public interface IVehicle {
    // Retorna a autonomia.
    int range();
    // Calcula o combustível necessário para percorrer a distância especificada.
    double fuelneeded(int miles);
    // Acessa métodos de variáveis de instância.
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}
