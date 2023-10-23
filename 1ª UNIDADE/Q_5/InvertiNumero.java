package Q_5;

import java.util.Scanner;

public class InvertiNumero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int c, d, u, num;
        double cAux, dAux;

        System.out.print("Informe um número de 3 dígitos: ");
        num = input.nextInt(); // 123

        c = ((num / 100)); // 1
        cAux = (num / 100.0); // 1,23

        d = (int)((cAux - c) * 100) / 10; // 2
        dAux = ((cAux - c) * 100.0) / 10; // 2,3

        u = (int) (((dAux - d) * 10) + 0.2); // 3

        System.out.printf("%n1 - CDU: %d%n", num);
        System.out.printf("%n2 - UCD: %d%d%d%n",u, c, d);
    }
}
