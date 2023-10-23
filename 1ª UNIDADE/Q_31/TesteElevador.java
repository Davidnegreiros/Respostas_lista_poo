package Q_31;

import java.util.Scanner;

public class TesteElevador {
    public static void main(String[] args){
        Elevador elevador = new Elevador(10, 5);
        Scanner input = new Scanner(System.in);
        elevador.setAndarAtual(0);
        elevador.setQuantidadeDePessoas(0);

        int op1, op2;

        do {
            System.out.printf("%nDigite [1] para entrar!");
            System.out.printf("%nDigite [2] para sair!");
            System.out.printf("%nDigite [3] para subir!");
            System.out.printf("%nDigite [4] para descer!");
            System.out.printf("%nOPÇÃO: ");
            op1 = input.nextInt();

            switch(op1){
                case 1:
                    System.out.printf("%nTotal de pessoas no elevador: %d", elevador.entra(elevador.getQuantidadeDePessoas()));
                    break;
                case 2:
                    System.out.printf("%nTotal de pessoas no elevador: %d", elevador.sai(elevador.getQuantidadeDePessoas()));
                    break;
                case 3:
                    System.out.printf("%nAndar atual: %d", elevador.sobe(elevador.getAndarAtual()));
                    break;
                case 4:
                    System.out.printf("%nAndar atual: %d", elevador.desce(elevador.getAndarAtual()));
                    break;
            }
            System.out.printf("%nDeseja comtinuar? [1] SIM     [2] NÃO: ");
            op2 = input.nextInt();
        }while (op2 == 1);
    }
}
