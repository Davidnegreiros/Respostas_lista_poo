package Q_44;


public class EventoDelegacao {
    protected String nomeDoEvento;
    protected DataHora infoEvento;

    public EventoDelegacao(String data, String hora, String nomeDoEvento) {
        this.infoEvento = new DataHora(data, hora);
        this.nomeDoEvento = nomeDoEvento;
    }

    public EventoDelegacao(String nomeDoEvento, DataHora infoEvento) {
        this.nomeDoEvento = nomeDoEvento;
        this.infoEvento = infoEvento;
    }

    public String toString(){
        return "Nome do Evento: " + nomeDoEvento + '\n' +
                infoEvento.toString();
    }
}
