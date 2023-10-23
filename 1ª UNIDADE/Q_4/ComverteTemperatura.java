package Q_4;

import java.util.Scanner;

public class ComverteTemperatura {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double cent, fah;

        System.out.printf("%nInforme a temperatura em graus centígrados: ");
        cent = input.nextDouble();

        fah = (cent * 1.8) + 32;

        System.out.printf("%nA temperatura em Fahrenheit é: %.2f", fah);
    }
}
