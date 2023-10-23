package Q_49;

public class Funcionario {
    private String nome;
    private String id;
    private double salarioHora;

    public Funcionario(String nome) {
        this.nome = nome;
        this.id = "12345";
        this.salarioHora = 2.0;
    }

    public Funcionario(String nome, double salarioHora) {
        this.nome = nome;
        this.id = "54321";
        this.salarioHora = salarioHora;
    }

    public String toString(){
        return '\n'+
                "Nome: " + nome + '\n'+
                "ID: " + id + '\n'+
                "Salário Mensal: " + ((salarioHora * 8) * 30) + '\n';
    }
}
