package Q_29;

import java.util.Scanner;

public class TesteFatura {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String id, descricao;
        int quantidade;
        double preco;

        Fatura fatura2 = new Fatura();

        System.out.printf("%nInforme ID do produto: ");
        id = input.nextLine();
        fatura2.setNumeroID(id);

        System.out.printf("%nInforme a descrição do produto: ");
        descricao = input.nextLine();
        fatura2.setDescricaoDoProduto(descricao);

        System.out.printf("%nInforme a quantidade do comprada: ");
        quantidade = input.nextInt();
        fatura2.setQuantComprada(quantidade);

        System.out.printf("%nInforme o preço do produto: ");
        preco = input.nextDouble();
        fatura2.setPrecoUnitario(preco);

        displayFatura(fatura2);
    }

    public static void displayFatura(Fatura fatura){
        System.out.printf("%nID do produto: %s", fatura.getNumeroID());
        System.out.printf("%nDescrição do produto: %s", fatura.getDescricaoDoProduto());
        System.out.printf("%nQuantidade do produto: %d", fatura.getQuantComprada());
        System.out.printf("%nPreço do produto: %.2f", fatura.getPrecoUnitario());
        System.out.printf("%nTotal a pagar: R$%.2f", fatura.calculaTotal(fatura.getPrecoUnitario(), fatura.getQuantComprada()));
    }
}
