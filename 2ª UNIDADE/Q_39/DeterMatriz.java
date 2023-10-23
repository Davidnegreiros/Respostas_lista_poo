package Q_39;

public class DeterMatriz {
    private double[][] matriz;

   //public DeterMatriz(double p1, double p2, double p3, double p4) {
   //    this.matriz[0][0] = p1;
   //    this.matriz[0][1] = p2;
   //    this.matriz[1][0] = p3;
   //    this.matriz[1][1] = p4;
   //}

    public DeterMatriz(double[][] matriz) {
        this.matriz = matriz;
    }

    public static double calculaDeterminante(double[][] matriz){
        double a, b;

        a = matriz[0][0] * matriz[1][1];
        b = matriz[0][1] * matriz[1][0];

        return a - b;
    }

    public static void imprimeMatriz(double[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
