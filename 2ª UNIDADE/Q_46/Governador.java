package Q_46;

public class Governador extends Politico{
    protected String estado;

    public Governador(String nome, String idade, String partidoPolitico, String estado) {
        super(nome, idade, partidoPolitico);
        this.estado = estado;
    }

    public String toString(){
        return super.toString() +
                "Estado: " + estado + '\n';
    }
}
