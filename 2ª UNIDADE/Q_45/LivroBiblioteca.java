package Q_45;

public class LivroBiblioteca extends Livro{
    protected String dataDeEnprestimo;
    protected String dataDeDevolucao;

    public LivroBiblioteca(String nome, String autor, String editora, String edicao, String anoDePublicacao, String dataDeEnprestimo, String dataDeDevolucao) {
        super(nome, autor, editora, edicao, anoDePublicacao);
        this.dataDeEnprestimo = dataDeEnprestimo;
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public String toString(){
        return super.toString() +
                "Date de enprestimo: " + dataDeDevolucao + '\n' +
                "Data de devolução: " + dataDeDevolucao + '\n';
    }
}
