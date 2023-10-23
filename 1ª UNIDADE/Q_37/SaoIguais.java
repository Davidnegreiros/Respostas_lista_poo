package Q_37;

public class SaoIguais <T>{
    private T n1;
    private T n2;
    private T n3;

    public SaoIguais(T n1, T n2, T n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int quantIguais(){
        int cont = 0;

        if(this.n1.equals(this.n2)){
            cont++;
        }
        if(this.n1.equals(this.n3)){
            cont++;
        }
        if(this.n2.equals(this.n3)){
            cont++;
        }
        return cont;
    }

    public void imprime(){
        System.out.printf("%nAtributo 1: " + this.n1);
        System.out.printf("%nAtributo 2: " + this.n2);
        System.out.printf("%nAtributo 3: " + this.n3);
    }


}
