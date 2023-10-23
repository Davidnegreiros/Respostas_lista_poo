package Q_7;

import java.util.Scanner;

public class menorNumero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n1, n2, n3;

        System.out.printf("%nInforme o primeiro número: ");
        n1 = input.nextInt();

        System.out.printf("%nInforme o segundo número: ");
        n2 = input.nextInt();

        System.out.printf("%nInforme o terceiro número: ");
        n3 = input.nextInt();

        if((n1 < n2) && (n2 < n3)){
            System.out.printf("%nO menor número é: %d", n1);
        }
        else if((n2 < n1) && (n1 < n3)){
            System.out.printf("%nO menor número é: %d", n2);
        }
        else if((n3 < n1) && (n1 < n2)){
            System.out.printf("%nO menor número é: %d", n3);
        }
        else{
            System.out.printf("%nTodos os números são iguais!");
        }
    }
}
