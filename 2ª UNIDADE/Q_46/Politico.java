package Q_46;

public class Politico extends Pessoa{
    protected String partidoPolitico;

    public Politico(String nome, String idade, String partidoPolitico) {
        super(nome, idade);
        this.partidoPolitico = partidoPolitico;
    }

    public String toString(){
        return super.toString() +
                "Partido Politico: " + partidoPolitico + '\n';
    }
}
