package Q_6;

import java.util.Scanner;

public class ComverteTempo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int dia, hora, minutos;
        double diaAux, horaAux, num;

        System.out.printf("%nInforme um valor inteiro representando um intervalo em minutos: ");
        num = input.nextDouble(); // 9.257

        dia = (int) (num / 1440); // 6
        diaAux = (num / 1440.0); // 6,4284722222

        hora = (int) ((diaAux / 60) * 100); // 10
        horaAux = ((diaAux / 60.0) * 100.0); // 10,71412037

        minutos = (int) ((horaAux / 60.0) * 100.0); // 17

        System.out.printf("%n%d dias %d horas e %d minutos", dia, hora, minutos);

    }
}
