package Q_11;

import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x1, y1, x2, y2;

        System.out.printf("%nInforme um valor para o ponto X1: ");
        x1 = input.nextInt();

        System.out.printf("%nInforme um valor para o ponto Y1: ");
        y1 = input.nextInt();

        System.out.printf("%nInforme um valor para o ponto X2: ");
        x2 = input.nextInt();

        System.out.printf("%nInforme um valor para o ponto Y2: ");
        y2 = input.nextInt();

        if((x2 > x1) && (y2 > y1)){
            System.out.printf("%n O ponto 2 está à direita e a cima do ponto 1");
        }
        else if((x2 > x1) && (y2 < y1)){
            System.out.printf("%n O ponto 2 está à direita e a baixo do ponto 1");
        }
        else if((x2 < x1) && (y2 > y1)){
            System.out.printf("%n O ponto 2 está à esquerda e a cima do ponto 1");
        }
        else if((x2 < x1) && (y2 < y1)){
            System.out.printf("%n O ponto 2 está à esquerda e a baixo do ponto 1");
        }
        else if((x2 == x1) && (y2 > y1)){
            System.out.printf("%n O ponto 2 está à cima do ponto 1");
        }
        else if((x2 == x1) && (y2 < y1)){
            System.out.printf("%n O ponto 2 está à baixo do ponto 1");
        }
        else if((x2 > x1) && (y2 == y1)){
            System.out.printf("%n O ponto 2 está à esquerda do ponto 1");
        }
        else if((x2 < x1) && (y2 == y1)){
            System.out.printf("%n O ponto 2 está à direita do ponto 1");
        }
        else{
            System.out.printf("%nOs ponto são iguais");
        }
    }
}
