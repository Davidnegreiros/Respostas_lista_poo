package Q_45;

public class Livro {
    protected String nome;
    protected String autor;
    protected String editora;
    protected String edicao;
    protected String anoDePublicacao;

    public Livro(String nome, String autor, String editora, String edicao, String anoDePublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public String toString(){
        return '\n' + "Livro: " + nome + '\n' +
                "Autor: " + autor + '\n' +
                "Editora: " + editora + '\n' +
                "Edição: " + edicao + '\n' +
                "Ano de publicação: " + anoDePublicacao + '\n';
    }
}
