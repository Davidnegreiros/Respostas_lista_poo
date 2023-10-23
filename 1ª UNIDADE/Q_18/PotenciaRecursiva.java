package Q_18;

import java.util.Scanner;

public class PotenciaRecursiva {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int base, expoente;

        System.out.printf("%nInforme a base: ");
        base = input.nextInt();
        System.out.printf("%nInforme o expoente: ");
        expoente = input.nextInt();

        System.out.printf("%nResultado = %d", potencia(base, expoente));
    }

    public static int potencia(int base, int expoente){
        if(expoente == 0){
            return 1;
        }
        else{
            return base * (potencia (base, expoente - 1));
        }
    }
}
