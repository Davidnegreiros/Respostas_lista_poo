package Q_35;

public class TesteMaiorValor {
    public static void main(String[] args){
        double n1 = 5.6;
        double n2 = 3.9;
        double n3 = 4.7;
        double n4 = 4.7;
        double n5 = 52.2;

        int n6 = 5;
        int n7 = 3;
        int n8 = 47;
        int n9 = 4;
        int n10 = 52;

        System.out.printf("%nO maior valor entre %.2f e %.2f é: %.2f", n1, n2, MaiorValor.maior(n1, n2));
        System.out.printf("%nO maior valor entre %d e %d é: %d", n10, n7, MaiorValor.maior(n10, n7));
        System.out.printf("%nO maior valor entre %.2f,  %.2f e %.2f é: %.2f", n1, n2, n3, MaiorValor.maior(n1, n2, n3));
        System.out.printf("%nO maior valor entre %.2f,  %.2f,  %.2f e %.2f é: %.2f", n1, n2, n3, n4, MaiorValor.maior(n1, n2, n3, n4));
        System.out.printf("%nO maior valor entre %.2f,  %.2f,  %.2f,  %.2f e %.2f é: %.2f", n1, n2, n3, n4, n5, MaiorValor.maior(n1, n2, n3, n4, n5));
    }
}
