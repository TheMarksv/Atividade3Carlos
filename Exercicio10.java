// Exercício 10: Classe Abstrata
import java.util.ArrayList;
import java.util.List;

public class Exercicio10 {

    public static void main(String[] args) {
        // Criação de objetos Carro e Moto (subclasses de Veiculo)
        Carro carro1 = new Carro("Toyota", "Corolla");
        Moto moto1 = new Moto("Honda", "CBR");

        // Criação de uma lista de objetos do tipo Veiculo (polimorfismo)
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(moto1);

        // Iteração sobre a lista e chamada do método mover() para cada objeto
        for (Veiculo veiculo : veiculos) {
            veiculo.mover(); // Demonstração do polimorfismo
        }
    }
}

// Classe abstrata Veiculo
abstract class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método abstrato mover() (sem implementação na classe abstrata)
    public abstract void mover();
}

// Classe Carro (subclasse de Veiculo)
class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("O carro " + marca + " " + modelo + " está andando.");
    }
}

// Classe Moto (subclasse de Veiculo)
class Moto extends Veiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("A moto " + marca + " " + modelo + " está correndo.");
    }
}

// Interface Trabalhador, classes Funcionario, Gerente, Pessoa e Estudante (mesmo código dos exercícios anteriores)
// ...
