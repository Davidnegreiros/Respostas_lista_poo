package Q_2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double n1, n2, n3, soma, media;

        System.out.printf("%nInsira o primeiro numero: ");
        n1 = input.nextDouble();

        System.out.printf("%nInsira o segundo numero: ");
        n2 = input.nextDouble();

        System.out.printf("%nInsira o terceiro numero: ");
        n3 = input.nextDouble();

        soma = n1 + n2 + n3;
        media = soma / 3;

        System.out.printf("%nValor da soma: %.2f", soma);
        System.out.printf("%nValor da media: %.2f", media);
    }
}
