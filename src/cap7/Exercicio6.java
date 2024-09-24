package cap7;

class VeiculoEx6 {
    public void acelerar() {
        System.out.println("O ve�culo est� acelerando...");
    }

    public void frear() {
        System.out.println("O ve�culo est� freando...");
    }
}

class CarroEx6 extends VeiculoEx6 {
    public void acelerar() {
        System.out.println("O carro est� acelerando rapidamente...");
    }
}

class MotoEx6 extends VeiculoEx6 {
    public void acelerar() {
        System.out.println("A moto est� acelerando rapidamente...");
    }
}

public class Exercicio6 {
    public static void main(String[] args) {
        VeiculoEx6 carro = new CarroEx6();  // Refer�ncia da superclasse, objeto da subclasse
        carro.acelerar();  // Chama o m�todo da subclasse Carro
        carro.frear();

        VeiculoEx6 moto = new MotoEx6();  // Refer�ncia da superclasse, objeto da subclasse
        moto.acelerar();  // Chama o m�todo da subclasse Carro
        moto.frear();

        VeiculoEx6 veiculo = new VeiculoEx6();
    }
}
