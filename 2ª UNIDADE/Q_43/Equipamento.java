package Q_43;

public class Equipamento {
    private String cpu;
    private String gpu;

    //public Equipamento(String cpu, String gpu) {
    //    this.cpu = cpu;
    //    this.gpu = gpu;
    //}
    //public Equipamento() {}

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getGpu() {
        return gpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String toString(){
        return "CPU: " + cpu + '\n' +
                "GPU: " + gpu + '\n';
    }
}
