package Q_44;

public class DemoDataHora {
    public static void main(String[] args){
        EventoDelegacao eventoDelegacao = new EventoDelegacao("10/09/2023", "10:20", "Aula POO");
        System.out.println(eventoDelegacao);

        EventoHeranca eventoHeranca = new EventoHeranca("25/09/2023", "09:45", "Aula de Banco de Dados");
        System.out.println(eventoHeranca);
    }
}
