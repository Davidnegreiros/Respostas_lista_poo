package Q_44;

public class EventoHeranca extends DataHora{
    protected String nomeDoEvento;

    public EventoHeranca(String data, String hora, String nomeDoEvento) {
        super(data, hora);
        this.nomeDoEvento = nomeDoEvento;
    }

    public String toString(){
        return "Nome do Evento: " + nomeDoEvento + '\n'+
                super.toString();
    }
}
