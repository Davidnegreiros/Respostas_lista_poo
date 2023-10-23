package Q_45;

public class LivroLivraria extends Livro{
    protected String preco;

    public LivroLivraria(String nome, String autor, String editora, String edicao, String anoDePublicacao, String preco) {
        super(nome, autor, editora, edicao, anoDePublicacao);
        this.preco = preco;
    }

    public String toString(){
        return super.toString() +
                "Preço: " + preco + '\n';
    }
}
