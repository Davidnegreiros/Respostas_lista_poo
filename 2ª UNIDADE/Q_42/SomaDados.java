package Q_42;

import java.security.SecureRandom;

public class SomaDados {
    public static void main(String[] args){
        SecureRandom faceDado1 = new SecureRandom();
        SecureRandom faceDado2 = new SecureRandom();

        int somaDados;
        int[] valorSoma = new int[12];

        for(int i = 0; i < 300; i++){
            somaDados = 0;
            int dado1 = (1 + faceDado1.nextInt(6));
            int dado2 = (1 + faceDado2.nextInt(6));
            somaDados = dado1 + dado2;

            if(somaDados == 2){
                ++valorSoma[1];
            }
            else if(somaDados == 3){
                ++valorSoma[2];
            }
            else if(somaDados == 4){
                ++valorSoma[3];
            }
            else if(somaDados == 5){
                ++valorSoma[4];
            }
            else if(somaDados == 6){
                ++valorSoma[5];
            }
            else if(somaDados == 7){
                ++valorSoma[6];
            }
            else if(somaDados == 8){
                ++valorSoma[7];
            }
            else if(somaDados == 9){
                ++valorSoma[8];
            }
            else if(somaDados == 10){
                ++valorSoma[9];
            }
            else if(somaDados == 11){
                ++valorSoma[10];
            }
            else{
                ++valorSoma[11];
            }
        }
        for(int i = 0; i < valorSoma.length; i++){
            System.out.printf("%nTotal de somas com valor igual a %d: %d", i+1, valorSoma[i]);
        }
    }
}