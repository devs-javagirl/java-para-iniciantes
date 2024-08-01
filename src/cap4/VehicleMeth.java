package cap4;

public class VehicleMeth {
    int passengers; // número de passageiros
    int fuelcap; // capacidade de armazenamento de combustível em galões
    int mpg; // consumo de combustível em milhas por galão

    // Exibe a autonomia.
    // O método range( ) está contido dentro da classe Vehicle.
    int range() {
      //  System.out.println("Range is " + fuelcap * mpg);
        //Observe que fuelcap e mpg são usadas diretamente, sem o operador ponto.
        return fuelcap * mpg;
    }

}
