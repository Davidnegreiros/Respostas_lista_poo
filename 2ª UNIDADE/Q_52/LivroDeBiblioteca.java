package Q_52;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    protected String descricao;
    protected String localizacao;

    public LivroDeBiblioteca(String titulo, String autor, String numeroDePaginas, String anoDaEdicao, String descricao, String localizacao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.descricao = descricao;
        this.localizacao = localizacao;
    }

    public boolean estaEmprestado(){
        if(empresta()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean empresta(){
        return true;
    }
    public boolean devolve(){
        return false;
    }
    public String localizacao(){
        return this.localizacao;
    }
    public String descricao(){
        return this.descricao;
    }

    public String toString(){
        return super.toString()+
                "Descrição do livro: " + descricao + '\n'+
                "Localização do livro: " + localizacao + '\n';
    }
}
