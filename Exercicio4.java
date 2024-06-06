// Exercício 4: Sobrescrita de Métodos
public class Exercicio4 {

    public static void main(String[] args) {
        // Criação de um objeto da classe Estudante (subclasse de Pessoa)
        Estudante estudante1 = new Estudante("Pedro", 19, "Engenharia");

        // Chama o método exibirInformacoes() da classe Estudante
        estudante1.exibirInformacoes(); // Irá exibir nome, idade e curso
    }
}

// Classe Pessoa (mesmo código do Exercício 2)
class Pessoa {
    // ... (mesmo código da classe Pessoa do Exercício 1)

    class Pessoa {
        // Atributos privados (encapsulamento)
        private String nome;
        private int idade;
    
        // Construtor para inicializar os atributos
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    
        // Métodos de acesso (getters) para obter os valores dos atributos
        public String getNome() {
            return nome;
        }
    
        public int getIdade() {
            return idade;
        }
    
        // Métodos de modificação (setters) para alterar os valores dos atributos
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void setIdade(int idade) {
            this.idade = idade;
        }
    }
    

    // Método para exibir informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

// Classe Estudante (mesmo código do Exercício 3)
// ...
