// Exercício 2: Criando Métodos na Classe
public class Exercicio2 {

    public static void main(String[] args) {
        // Criação de um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Carlos", 42);

        // Chama o método exibirInformacoes() para mostrar os dados da pessoa
        pessoa1.exibirInformacoes();
    }
}

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
}
