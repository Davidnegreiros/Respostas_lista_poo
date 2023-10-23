package Q_47;

public class Tecnico extends Assistente{
    protected double bonusSalarial;

    public double getBonusSalarial() {
        return bonusSalarial;
    }
    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    public double ganhoAnual(double decimoT){
        return (((this.salario + this.bonusSalarial) * 12) + decimoT);
    }

    public String toString(){
        return super.toString()+
                " Bônus Salarial: " + bonusSalarial;
    }
}
