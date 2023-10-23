package Q_41;

import java.util.Scanner;

public class CalculaProdutoTeste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 1;

        System.out.println(CalculaProduto.produto(8,8));
        System.out.println(CalculaProduto.produto(10, 10, 10));
        System.out.println(CalculaProduto.produto(2, 2, 2, 2, 2, 2, 2));
    }
}
