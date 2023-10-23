package Q_19;

import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num;

        System.out.printf("%nInforme um número para o fatorial: ");
        num = input.nextInt();

        for(int i = 0; i <= num; i++){
            //System.out.printf("%n%d! = %d",i ,fatorial(i));
            System.out.println("\t".repeat(i) + i + "!" + fatorial(i));
        }
    }

    public static int fatorial(int num){
        if(num == 0){
            return 1;
        }
        else{
            return num * (fatorial(num - 1));
        }
    }
}
