package Q_14;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int repeticoes, anterior = 0, posterior = 1, auxiliar, inicio =1;

        System.out.printf("%nSérie de Fibonacci");

        System.out.printf("%nInforme a quantidade de repetições: ");
        repeticoes = input.nextInt();
        System.out.printf("%d", inicio);

        for(int i = 1; i < repeticoes; i++){
            auxiliar = anterior + posterior;
            anterior = posterior;
            posterior = auxiliar;

            System.out.printf(", %d", auxiliar);
        }
    }
}
