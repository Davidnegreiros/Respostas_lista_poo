package Q_46;

public class Pessoa {
    protected String nome;
    protected String idade;

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return '\n' + "Nome: " + nome + '\n' +
                "Idade: " + idade + '\n';
    }
}
