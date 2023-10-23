package Q_20;

import java.util.Scanner;

public class MdcRecursivo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, m;

        System.out.printf("%nImforme um valor inteiro para n: ");
        n = input.nextInt();
        System.out.printf("%nImforme um valor inteiro para m: ");
        m = input.nextInt();

        System.out.printf("%n%nO MDC de %d e %d é: %d", n, m, mdc(n, m));
    }

    public static int mdc(int n, int m){
        if(m == 0){
            return n;
        }
        else{
            return mdc(m, (n%m));
        }
    }
}
