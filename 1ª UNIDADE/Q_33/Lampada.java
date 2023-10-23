package Q_33;

public class Lampada {
    private boolean estadoDaLampada;

    public void acende(){
        this.estadoDaLampada = true;
    }

    public void apaga(){
        this.estadoDaLampada = false;
    }

    public void motraStado(){
        if(this.estadoDaLampada == true){
            System.out.printf("%nA lampada está ligada!");
        }
        else{
            System.out.printf("%nA lampada está desligada!");
        }
    }
}
