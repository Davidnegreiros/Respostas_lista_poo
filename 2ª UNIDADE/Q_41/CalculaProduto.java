package Q_41;

public class CalculaProduto {
    public static int produto(int...valores){
        int produto = 1;

        for(int num : valores){
            produto *= num;
        }
        return produto;
    }
}
