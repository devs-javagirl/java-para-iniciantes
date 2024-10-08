package cap7;

class Veiculo{
    String marca;
    String modelo;

    public Veiculo() { }

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void frear() {
        System.out.println("O veículo está freando...");
    }
}

class Carro extends Veiculo {
    int numeroDePortas;

    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo);  // Chamando o construtor da superclasse
        this.numeroDePortas = numeroDePortas;
    }

    public void abrirPorta() {
        System.out.println("Abrindo as portas do carro.");
    }
}

class Moto extends Veiculo {
    int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super.marca = marca;
        super.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public void apresentarInformacoes() {
        System.out.println("Abrindo as portas do carro.");
    }
}

public class Exercicio4 {
    public static void main(String[] args) {

    }
}
