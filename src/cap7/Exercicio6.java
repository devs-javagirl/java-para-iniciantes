package cap7;

class VeiculoEx6 {
    public void acelerar() {
        System.out.println("O veículo está acelerando...");
    }

    public void frear() {
        System.out.println("O veículo está freando...");
    }
}

class CarroEx6 extends VeiculoEx6 {
    public void acelerar() {
        System.out.println("O carro está acelerando rapidamente...");
    }
}

class MotoEx6 extends VeiculoEx6 {
    public void acelerar() {
        System.out.println("A moto está acelerando rapidamente...");
    }
}

public class Exercicio6 {
    public static void main(String[] args) {
        VeiculoEx6 carro = new CarroEx6();  // Referência da superclasse, objeto da subclasse
        carro.acelerar();  // Chama o método da subclasse Carro
        carro.frear();

        VeiculoEx6 moto = new MotoEx6();  // Referência da superclasse, objeto da subclasse
        moto.acelerar();  // Chama o método da subclasse Carro
        moto.frear();

        VeiculoEx6 veiculo = new VeiculoEx6();
    }
}
