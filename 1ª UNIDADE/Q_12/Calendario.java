package Q_12;

import java.util.Scanner;

public class Calendario {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int dia;

        do{
            System.out.printf("%nInforme um dia entre 1 e 28 para o mês de Fevereiro: ");
            dia = input.nextInt();
        }while((dia < 1) || (dia > 28));

        switch(dia){
            case 1:
            case 8:
            case 15:
            case 22:
                System.out.printf("%nO dia %d é um dia de Domingo!", dia);
                break;
            case 2:
            case 9:
            case 16:
            case 23:
                System.out.printf("%nO dia %d é um dia de Segunda!", dia);
                break;
            case 3:
            case 10:
            case 17:
            case 24:
                System.out.printf("%nO dia %d é um dia de Terça-feira!", dia);
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                System.out.printf("%nO dia %d é um dia de Quarta-feira!", dia);
                break;
            case 5:
            case 12:
            case 19:
            case 26:
                System.out.printf("%nO dia %d é um dia de Quinta-feira!", dia);
                break;
            case 6:
            case 13:
            case 20:
            case 27:
                System.out.printf("%nO dia %d é um dia de Sexta-feira!", dia);
                break;
            case 7:
            case 14:
            case 21:
            case 28:
                System.out.printf("%nO dia %d é um dia de Sabado!", dia);
                break;
        }
    }
}
