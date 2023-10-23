package Q_39;

public class DeterMatrizTeste {
    public static void main(String[] args){
        //DeterMatriz deterMatriz = new DeterMatriz(5.0, 8.0, 9.0, 4.0);

        double[][] matriz = {{5.0, 8.0}, {9.0, 4.0}};

        DeterMatriz.imprimeMatriz(matriz);

        System.out.printf("%nO valor do determinante é: %.2f", DeterMatriz.calculaDeterminante(matriz));
    }
}
