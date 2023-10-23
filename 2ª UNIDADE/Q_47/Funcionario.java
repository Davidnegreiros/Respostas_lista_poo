package Q_47;

public class Funcionario {
    protected String nome;
    protected double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentarSalario(double aumento){
        return this.salario + aumento;
    }

    public double ganhoAnual(double decimoT){
        return (this.salario * 12) + decimoT;
    }


    public String toString(){
        return '\n' +
                "Nome: " + nome + '\n'+
                "Salário: " + salario + '\n';
    }
}
