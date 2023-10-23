package Q_15;

public class NumeroPerfeito {
    public static void main (String[] args){
        System.out.println("Este programa calcula e exibe os cinco primeiros números perfeitos.");

        int quantEncontrada = 0;
        long valTestado = 0;
        long divisor;

        long somaDivisores = 0;

        do{
            valTestado++; // incremento
            divisor = 1; // reiniciar o valor do divisor
            somaDivisores = 0; // reiniciar a soma dos divisores

            // descobrir os divisores e soma-los, excluindo o valor em si
            do{
                if (valTestado % divisor == 0 && valTestado != 1) // segunda parte porque a soma dos divisores de 1 (um) deve ser 0
                    somaDivisores += divisor;

                divisor++;
            } while (divisor < valTestado);

            if (somaDivisores == valTestado){
                System.out.println("Achei um número perfeito: " + valTestado + ".");
                quantEncontrada++;
            }
        } while (quantEncontrada < 5);

        System.out.println("\nFIM DO PROGRAMA.");
    }
}
