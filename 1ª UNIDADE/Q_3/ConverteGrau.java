package Q_3;

import java.util.Scanner;

public class ConverteGrau {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double angulo, radianos, seno, cosseno, tangente, cossecante, secante, cotangente;

        System.out.printf("%nInforme o valor do ângulo em graus: ");
        angulo = input.nextDouble();

        radianos = Math.toRadians(angulo);
        seno = Math.sin(angulo);
        cosseno = Math.cos(angulo);
        tangente = Math.tan(angulo);
        cossecante = Math.asin(angulo);
        secante = Math.acos(angulo);
        cotangente = Math.atan(angulo);

        System.out.printf("%nValor em Radianos: %.2f", radianos);
        System.out.printf("%nValor em Seno: %.2f", seno);
        System.out.printf("%nValor em Cosseno: %.2f", cosseno);
        System.out.printf("%nValor em Tangente: %.2f", tangente);
        System.out.printf("%nValor em Cossecante: %.2f", cossecante);
        System.out.printf("%nValor em Secante: %.2f", secante);
        System.out.printf("%nValor em Cotangente: %.2f", cotangente);
    }
}
