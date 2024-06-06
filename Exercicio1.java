// Exercício 1: Criando uma Classe Simples
public class Exercicio1 {

    public static void main(String[] args) {

        // Criação de um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("João", 25);

        // Exibição dos atributos da pessoa
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());

        // Alteração dos atributos da pessoa
        pessoa1.setNome("Maria");
        pessoa1.setIdade(30);

        // Exibição dos atributos modificados
        System.out.println("\nApós modificação:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
    }
}

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
