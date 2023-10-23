package Q_31;

public class Elevador {
    private int terreo = 0;
    private int andarAtual;
    private int totalDeAndaresNoPredio;
    private int capacidadeDoElevador;
    private int quantidadeDePessoas;

    public Elevador(int totalDeAndaresNoPredio, int capacidadeDoElevador) {
        this.totalDeAndaresNoPredio = totalDeAndaresNoPredio;
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    //==============================================================================================

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    //================================================================================================

    public int entra(int quantidadeDePessoas){
        if(this.quantidadeDePessoas < this.capacidadeDoElevador){
            return this.quantidadeDePessoas += 1;
        }
        else{
            return this.quantidadeDePessoas;
        }
    }

    public int sai(int quantidadeDePessoas){
        if(this.quantidadeDePessoas <= this.capacidadeDoElevador){
            return this.quantidadeDePessoas -=1;
        }
        else{
            return this.quantidadeDePessoas;
        }
    }

    public int sobe(int andarAtual){
        if(this.andarAtual < this.totalDeAndaresNoPredio){
            return this.andarAtual += 1;
        }
        else{
            return this.andarAtual;
        }
    }

    public int desce(int andarAtual){
        if((this.andarAtual <= this.totalDeAndaresNoPredio) && (this.andarAtual > this.terreo)){
            return this.andarAtual -= 1;
        }
        else{
            return this.andarAtual;
        }
    }
}
