// Exercício 5: Criando uma Classe com Atributos Protegidos
public class Exercicio5 {

    public static void main(String[] args) {
        // Criação de um objeto da classe Funcionario
        Funcionario funcionario1 = new Funcionario("Alice", 35, 3500.0, "Marketing");

        // Criação de um objeto da classe Gerente (subclasse de Funcionario)
        Gerente gerente1 = new Gerente("Bruno", 45, 6000.0, "Vendas", 1500.0);

        // Exibição das informações de cada objeto
        funcionario1.exibirInformacoes();
        System.out.println("---------------");
        gerente1.exibirInformacoes();
    }
}

// Classe Pessoa (mesmo código do Exercício 2)
// ...

class Funcionario extends Pessoa {
    // Atributos protegidos (acessíveis na própria classe e subclasses)
    protected double salario;
    protected String departamento;

    // Construtor da classe Funcionario
    public Funcionario(String nome, int idade, double salario, String departamento) {
        super(nome, idade);
        this.salario = salario;
        this.departamento = departamento;
    }

    // Método para exibir informações do funcionário
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da superclasse para exibir nome e idade
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}

class Gerente extends Funcionario {
    // Atributo privado (acessível apenas dentro da classe Gerente)
    private double bonus;

    // Construtor da classe Gerente
    public Gerente(String nome, int idade, double salario, String departamento, double bonus) {
        super(nome, idade, salario, departamento);
        this.bonus = bonus;
    }

    // Sobrescrita do método exibirInformacoes() para incluir o bônus
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da superclasse para exibir nome, idade, salário e departamento
        System.out.println("Bônus: " + bonus);
    }
}
