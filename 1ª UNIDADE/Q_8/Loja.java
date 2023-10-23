package Q_8;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int opcao;
        double preco, desconto;

        do{
            System.out.printf("%nEscolha uma das opções a seguir");
            System.out.printf("%nSetor de Eletros, código [222]");
            System.out.printf("%nSetor de Cama, mesa e banho, código [111]");
            System.out.printf("%nInsira o código: ");
            opcao = input.nextInt();
        }while((opcao != 222) && (opcao != 111));

        System.out.printf("%nInforme o preço do produto: ");
        preco = input.nextDouble();

        if(opcao == 222){
            if(preco <= 500){
                System.out.printf("%nSetor de Eletros");
                System.out.printf("%nPreço do produto: %.2f", preco);
            }
            else{
                desconto = preco - (preco * 0.1);
                System.out.printf("%nSetor de Eletros");
                System.out.printf("%nPreço do produto: %.2f", desconto);
            }
        }
        else{
            if(preco > 100){
                desconto = preco - (preco * 0.4);
                System.out.printf("%nSetor de Cama, mesa e banho");
                System.out.printf("%nPreço do produto: %.2f", desconto);
            }
            if((preco >= 50) && (preco <= 100)){
                desconto = preco - (preco * 0.2);
                System.out.printf("%nSetor de Cama, mesa e banho");
                System.out.printf("%nPreço do produto: %.2f", desconto);
            }
            else{
                desconto = preco - (preco * 0.1);
                System.out.printf("%nSetor de Cama, mesa e banho");
                System.out.printf("%nPreço do produto: %.2f", desconto);
            }
        }
    }
}
