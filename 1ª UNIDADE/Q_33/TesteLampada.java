package Q_33;

import java.util.Scanner;

public class TesteLampada {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Lampada lampada = new Lampada();

        int op1, op2;

        do {
            System.out.printf("%nDigite [1] para ligar a lampada!");
            System.out.printf("%nDigite [2] para desligar a lampada!");
            System.out.printf("%nOPÇÃO: ");
            op1 = input.nextInt();

            switch(op1){
                case 1:
                    lampada.acende();
                    lampada.motraStado();
                    break;
                case 2:
                    lampada.apaga();
                    lampada.motraStado();
                    break;
            }
            System.out.printf("%n%nComtinuar? [1]SIM  [2]NÃO: ");
            op2 = input.nextInt();
        }while(op2 == 1);
    }
}
