package Q_37;

public class TesteSaoIguais {
    public static void main(String[] args){

        SaoIguais <Integer> saoIguais1 = new SaoIguais<>(2,2,2);
        System.out.printf("%nO número de atributos iguais são: " + saoIguais1.quantIguais());
        saoIguais1.imprime();

        SaoIguais <Double> saoIguais2 = new SaoIguais<>(5.5, 5.5, 7.0);
        System.out.printf("%nO número de atributos iguais são: " + saoIguais2.quantIguais());
        saoIguais2.imprime();

        SaoIguais <String> saoIguais3 = new SaoIguais<>("teste", "teste", "teste");
        System.out.printf("%nO número de atributod iguais são: " + saoIguais3.quantIguais());
        saoIguais3.imprime();
    }
}
