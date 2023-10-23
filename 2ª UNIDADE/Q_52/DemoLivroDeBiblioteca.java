package Q_52;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args){
        LivroDeBiblioteca livro = new LivroDeBiblioteca("O Senhor dos Anéis: A Sociedade do Anel",
                "J. R. R. Tolkien", "200", "1954", "Livro de Aventura",
                "Corredor 2, prateleira D");

        System.out.println(livro.localizacao());
        System.out.println(livro.descricao());
        System.out.println(livro.qualTitulo());
        System.out.println(livro.qualAutor());

        //livro.empresta();
        System.out.println("O livro foi enprestado?: " + livro.estaEmprestado());
        //livro.devolve();
        //System.out.println("Estado do livro: " + livro.estaEmprestado());
    }
}
