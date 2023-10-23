package Q_40;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private int telefone;

    public Cliente(int id, String nome, int idade, int telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public void imprime(){
        System.out.printf("%nID: %d", this.id);
        System.out.printf("%nNome: %s", this.nome);
        System.out.printf("%nIdade: %d", this.idade);
        System.out.printf("%nTelefone: %d", this.telefone);
    }
}
