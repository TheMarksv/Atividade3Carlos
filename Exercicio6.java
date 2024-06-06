// Exercício 6: Sobrecarga de Construtores
public class Exercicio6 {

    public static void main(String[] args) {
        // Criação de objetos da classe Pessoa usando os diferentes construtores
        Pessoa pessoa1 = new Pessoa("Maria", 30);
        Pessoa pessoa2 = new Pessoa("João"); // Idade será definida como 0 por padrão

        // Criação de um objeto da classe Estudante usando o novo construtor de Pessoa
        Estudante estudante1 = new Estudante("Ana", "Ciência da Computação"); // Idade será 0

        // Exibição das informações de cada objeto
        pessoa1.exibirInformacoes(); // Nome: Maria, Idade: 30
        System.out.println("---------------");
        pessoa2.exibirInformacoes(); // Nome: João, Idade: 0
        System.out.println("---------------");
        estudante1.exibirInformacoes(); // Nome: Ana, Idade: 0, Curso: Ciência da Computação
    }
}

// Classe Pessoa (com sobrecarga de construtores)
class Pessoa {
    // ... (mesmo código da classe Pessoa do Exercício 5, mas com o novo construtor)

    // Novo construtor que recebe apenas o nome e define a idade como 0
    public Pessoa(String nome) {
        this(nome, 0);
