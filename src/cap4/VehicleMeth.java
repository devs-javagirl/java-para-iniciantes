package cap4;

public class VehicleMeth {
    int passengers; // n�mero de passageiros
    int fuelcap; // capacidade de armazenamento de combust�vel em gal�es
    int mpg; // consumo de combust�vel em milhas por gal�o

    // Exibe a autonomia.
    // O m�todo range( ) est� contido dentro da classe Vehicle.
    int range() {
      //  System.out.println("Range is " + fuelcap * mpg);
        //Observe que fuelcap e mpg s�o usadas diretamente, sem o operador ponto.
        return fuelcap * mpg;
    }

}
