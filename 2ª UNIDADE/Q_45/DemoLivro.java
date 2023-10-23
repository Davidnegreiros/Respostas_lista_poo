package Q_45;

public class DemoLivro {
    public static void main(String[] args){
        Livro livro = new Livro("O senhor dos Anéis: A Sociedade do Anel", "J. R. R. Tolkien", "Desconhecida", "1ª Edição", "29 de julho de 1954");
        System.out.println(livro);

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca("O senhor dos Anéis: As Duas Torres", "J. R. R. Tolkien", "Desconhecida", "1ª Edição", "11 de novembro de 1954", "09/09/2023", "09/10/2023");
        System.out.println(livroBiblioteca);

        LivroLivraria livroLivraria = new LivroLivraria("O senhor dos Anéis: O Retorno Do Rei", "J. R. R. Tolkien", "Desconhecida", "1ª Edição", "20 de outubro de 1955", "R$ 150,00");
        System.out.println(livroLivraria);
    }
}
