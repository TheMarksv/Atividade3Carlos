// Exercício 9: Polimorfismo com Classes
import java.util.ArrayList;
import java.util.List;

public class Exercicio9 {

    public static void main(String[] args) {
        // Criação de uma lista de objetos do tipo Pessoa
        List<Pessoa> pessoas = new ArrayList<>();

        // Adição de objetos Pessoa e Estudante à lista (polimorfismo)
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Estudante("Ana", 22, "Ciência da Computação"));

        // Iteração sobre a lista e chamada do método exibirInformacoes() para cada objeto
        for (Pessoa pessoa : pessoas) {
            pessoa.exibirInformacoes(); // Demonstração do polimorfismo
            System.out.println("---------------");
        }
    }
}

// Interface Trabalhador, classes Funcionario, Gerente, Pessoa e Estudante (mesmo código dos exercícios anteriores)
// ...
