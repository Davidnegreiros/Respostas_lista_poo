package Q_17;

public class Populacao {
    public static void main(String[] args){
        int cidadeA = 7000, cidadeB = 20000, anos = 0;

        while (cidadeA <= cidadeB){
            cidadeA += (0.035 * cidadeA); // (3,5 / 100) * 7.000 = 245 ao ano
            cidadeB += (0.01 * cidadeB); // (1 / 100) * 20.000 = 200 ao ano
            anos ++;
        }

        System.out.printf("%nSeriam ncessarios %d anos", anos);
    }
}
