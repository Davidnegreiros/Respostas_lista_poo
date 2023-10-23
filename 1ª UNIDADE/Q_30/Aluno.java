package Q_30;

public class Aluno {
    String matricula;
    String nome;
    double n1Prova;
    double n2Prova;
    double notaTrabalho;

    public Aluno(String matricula, String nome, double n1Prova, double n2Prova, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.n1Prova = n1Prova;
        this.n2Prova = n2Prova;
        this.notaTrabalho = notaTrabalho;
    }
    public Aluno(){}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1Prova() {
        return n1Prova;
    }

    public void setN1Prova(double n1Prova) {
        this.n1Prova = n1Prova;
    }

    public double getN2Prova() {
        return n2Prova;
    }

    public void setN2Prova(double n2Prova) {
        this.n2Prova = n2Prova;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double media(double n1Prova, double n2Prova, double notaTrabalho){
        return (((this.n1Prova * 2.5) + (this.n2Prova * 2.5) + (this.notaTrabalho * 2.0)) / (2.5 + 2.0));
    }

    public double provaFinal(double n1Prova, double n2Prova, double notaTrabalho){
        double media, mediaFinal;

        media = (((this.n1Prova * 2.5) + (this.n2Prova * 2.5) + (this.notaTrabalho * 2.0)) / (2.5 + 2.0));

        mediaFinal = 7.0 - media;

        if(mediaFinal > 0.0){
            return mediaFinal;
        }
        else{
            return 0;
        }
    }

    // TESTE
   // public String toString(){
   //     return "Nome: " + this.nome + '\n' +
   //             "Matrícula: " + this.matricula + '\n' +
   //             "Prova 1: " + this.n1Prova + '\n' +
   //             "Prova 2: " + this.n2Prova + '\n' +
   //             "Trabalho final: " + this.notaTrabalho + '\n';
   // }
}
