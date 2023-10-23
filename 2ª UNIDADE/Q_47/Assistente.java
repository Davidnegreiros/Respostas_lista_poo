package Q_47;

public class Assistente extends Funcionario{
    protected String matricula;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString(){
        return super.toString() +
                "Matrícula: " + matricula;
    }
}
