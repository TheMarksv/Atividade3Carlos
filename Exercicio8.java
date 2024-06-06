// Exercício 8: Polimorfismo com Interfaces
import java.util.ArrayList;
import java.util.List;

public class Exercicio8 {

    public static void main(String[] args) {
        // Criação de objetos Funcionario e Gerente
        Funcionario func1 = new Funcionario("Maria", 30, 2500.0, "RH");
        Gerente gerente1 = new Gerente("João", 40, 5000.0, "Vendas", 1000.0);

        // Criação de um objeto Empresa
        Empresa empresa = new Empresa();

        // Adição dos trabalhadores (Funcionario e Gerente) à empresa
        empresa.adicionarTrabalhador(func1);
        empresa.adicionarTrabalhador(gerente1);

        // Chamada do método fazerTodosTrabalharem() para demonstrar o polimorfismo
        empresa.fazerTodosTrabalharem();
    }
}

// Interface Trabalhador e classes Funcionario, Gerente e Pessoa (mesmo código do Exercício 7)
// ...

// Classe Empresa
class Empresa {
    // Lista para armazenar os trabalhadores
    private List<Trabalhador> trabalhadores = new ArrayList<>();

    // Método para adicionar um trabalhador à lista
    public void adicionarTrabalhador(Trabalhador trabalhador) {
        trabalhadores.add(trabalhador);
    }

    // Método para fazer todos os trabalhadores trabalharem (demonstração do polimorfismo)
    public void fazerTodosTrabalharem() {
        for (Trabalhador trabalhador : trabalhadores) {
            trabalhador.trabalhar(); // Chama o método trabalhar() de cada trabalhador
        }
    }
}
