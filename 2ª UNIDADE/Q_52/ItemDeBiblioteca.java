package Q_52;

public interface ItemDeBiblioteca {
    int MAXIMO_DE_DIAS_PARA_EMPRESTIMO = 14;

    boolean estaEmprestado(); // retorna verdadeiro se o item estiver emprestado e falso caso contrário.
    boolean empresta(); // modifica para verdadeiro o estado de um campo que indica se o itemestá emprestado ou não.
    boolean devolve(); // modifica para falso o estado de um campo que indica se o item está emprestado ou não.
    String localizacao(); // retorna um texto que informa o local do item na biblioteca (e.g: "corredor 2, prateleira D").
    String descricao(); // retorna texto contendo uma descrição resumida do item (e.g.: "artigo daECOP").
}
