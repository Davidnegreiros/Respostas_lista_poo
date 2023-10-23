package Q_52;

public class Livro {
    protected String titulo;
    protected String autor;
    protected String numeroDePaginas;
    protected String anoDaEdicao;

    public Livro(String titulo, String autor, String numeroDePaginas, String anoDaEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    public String qualTitulo(){
        return this.titulo;
    }
    public String qualAutor(){
        return this.autor;
    }
    public String toString(){
        return "Titulo: " + titulo + '\n'+
                "Autor: " + autor + '\n'+
                "Nº de pagínas: " + numeroDePaginas + '\n'+
                "Ano da adição: " + anoDaEdicao + '\n';
    }
}
