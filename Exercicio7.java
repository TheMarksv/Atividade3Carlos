// Exercício 7: Trabalhando com Interfaces
public class Exercicio7 {

    public static void main(String[] args) {
        // Criação de objetos Funcionario e Gerente (que implementam a interface Trabalhador)
        Funcionario func1 = new Funcionario("Maria", 30, 2500.0, "RH");
        Gerente gerente1 = new Gerente("João", 40, 5000.0, "Vendas", 1000.0);

        // Chamada do método trabalhar() para cada objeto
        func1.trabalhar(); // Saída: Maria está trabalhando no departamento RH
        gerente1.trabalhar(); // Saída: João (gerente) está trabalhando no departamento Vendas
    }
}

// Interface Trabalhador
interface Trabalhador {
    void trabalhar(); // Método abstrato que será implementado pelas classes
}

// Classe Funcionario (mesmo código do Exercício 5, mas agora implementando a interface Trabalhador)
class Funcionario extends Pessoa implements Trabalhador {
    // ... (atributos e outros métodos do Funcionario)

    @Override
    public void trabalhar() {
        System.out.println(this.nome + " está trabalhando no departamento " + this.departamento);
    }
}

// Classe Gerente (mesmo código do Exercício 5, mas agora implementando a interface Trabalhador)
class Gerente extends Funcionario {
    // ... (atributos e outros métodos do Gerente)

    @Override
    public void trabalhar() {
        System.out.println(this.nome + " (gerente) está trabalhando no departamento " + this.departamento);
    }
}

// Classe Pessoa (mesmo código do Exercício 6)
// ...
