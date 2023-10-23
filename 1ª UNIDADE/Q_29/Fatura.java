package Q_29;

public class Fatura{
    private String numeroID;
    private String descricaoDoProduto;
    private int quantComprada;
    private double precoUnitario;

    public void setNumeroID(String numeroID){
        this.numeroID = numeroID;
    }
    public String getNumeroID(){
        return numeroID;
    }

    public void setDescricaoDoProduto(String descricaoDoProduto){
        this.descricaoDoProduto = descricaoDoProduto;
    }
    public String getDescricaoDoProduto(){
        return descricaoDoProduto;
    }

    public void setQuantComprada(int quantComprada){
        if(quantComprada < 0){
            this.quantComprada = 0;
        }
        else{
            this.quantComprada = quantComprada;
        }
    }
    public int getQuantComprada(){
        return this.quantComprada;
    }

    public void setPrecoUnitario(double precoUnitario){
        if(precoUnitario < 0.0){
            this.precoUnitario = 0.0;
        }
        else{
            this.precoUnitario = precoUnitario;
        }
    }
    public double getPrecoUnitario(){
        return this.precoUnitario;
    }

    public double calculaTotal(double precoUnitario, int quantComprada){
        return this.precoUnitario * this.quantComprada;
    }
}
