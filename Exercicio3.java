// Exercício 3: Criando uma Subclasse
public class Exercicio3 {

    public static void main(String[] args) {
        // Criação de um objeto da classe Estudante (subclasse de Pessoa)
        Estudante estudante1 = new Estudante("Ana", 22, "Ciência da Computação");

        // Exibição das informações do estudante (herdadas de Pessoa e o curso)
        estudante1.exibirInformacoes();
    }
}

// Classe Pessoa (mesmo código do Exercício 2)
// ...

class Estudante extends Pessoa {
    // Atributo específico da classe Estudante
    private String curso;

    // Construtor da classe Estudante (chama o construtor da superclasse Pessoa)
    public Estudante(String nome, int idade, String curso) {
        super(nome, idade); 
        this.curso = curso;
    }

    // Método de acesso (getter) para obter o valor do atributo curso
    public String getCurso() {
        return curso;
    }

    // Método de modificação (setter) para alterar o valor do atributo curso
    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobrescrita do método exibirInformacoes() para incluir o curso
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da superclasse para exibir nome e idade
        System.out.println("Curso: " + curso);
    }
}
