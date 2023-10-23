package Q_44;

public class DataHora {
    protected String data;
    protected String hora;

    public DataHora(String data, String hora) {
        this.data = data;
        this.hora = hora;
    }

    public String toString(){
        return "Data: " + data + '\n' +
                "Horario: " + hora + '\n';
    }
}
