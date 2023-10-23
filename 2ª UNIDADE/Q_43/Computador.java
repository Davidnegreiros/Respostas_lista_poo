package Q_43;

public class Computador extends Equipamento{
    private String marca;
    private String modelo;

    //public Computador(String cpu, String gpu, String marca, String modelo) {
    //    super(cpu, gpu);
    //    this.marca = marca;
    //    this.modelo = modelo;
    //}
    //public Computador() {}

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString(){
        return super.toString() +
                "Marca: " + marca + '\n' +
                "Modelo: " + modelo + '\n';
    }
}
