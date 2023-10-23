package Q_46;

public class Prefeito extends Politico{
    protected String cidade;

    public Prefeito(String nome, String idade, String partidoPolitico, String cidade) {
        super(nome, idade, partidoPolitico);
        this.cidade = cidade;
    }

    public String toString(){
        return super.toString() +
                "Cidade: " + cidade + '\n';
    }
}
