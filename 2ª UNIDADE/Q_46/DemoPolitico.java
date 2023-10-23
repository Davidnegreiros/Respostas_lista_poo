package Q_46;

public class DemoPolitico {
    public static void main(String[] args){
        System.out.print("Pessoa");
        Pessoa pessoa = new Pessoa("Antonio", "32");
        System.out.println(pessoa);

        System.out.print("Politico");
        Politico politico = new Politico("André", "35", "POO");
        System.out.println(politico);

        System.out.print("Governador");
        Governador governador = new Governador("João", "44", "POO", "RN");
        System.out.println(governador);

        System.out.print("Prefeito");
        Prefeito prefeito = new Prefeito("Paulo", "30", "POO", "Pau dos Ferros");
        System.out.println(prefeito);
    }
}
