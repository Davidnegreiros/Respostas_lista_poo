package Q_1;

import java.util.Scanner;

public class CalculaQuadrado {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double lado, area;

        System.out.printf("%nInforme o valor do lado do quadrado: ");
        lado = input.nextDouble();

        area = Math.pow(lado, 2);

        System.out.printf("%nA area do quadrado he: %.2f%n", area);
        input.close();
    }
}
