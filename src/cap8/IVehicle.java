package cap8;

public interface IVehicle {
    // Retorna a autonomia.
    int range();
    // Calcula o combust�vel necess�rio para percorrer a dist�ncia especificada.
    double fuelneeded(int miles);
    // Acessa m�todos de vari�veis de inst�ncia.
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}
