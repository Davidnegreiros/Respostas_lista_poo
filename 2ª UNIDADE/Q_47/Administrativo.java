package Q_47;

public class Administrativo extends Assistente{
    protected String turno;
    protected double adNoturno;

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public double getAdNoturno() {
        return adNoturno;
    }
    public void setAdNoturno(double adNoturno) {
        this.adNoturno = adNoturno;
    }

    public double ganhoAnual(double decimoT){
        if(this.turno.equals("dia") || this.turno.equals("Dia") || this.turno.equals("DIA")){
            return (this.salario * 12) + decimoT;
        }
        else if(this.turno.equals("noite") || this.turno.equals("Noite") || this.turno.equals("NOITE")){
            return ((this.salario + this.adNoturno) * 12) + decimoT;
        }
        else{
            return 0;
        }
    }

    public String toString(){
        return super.toString()+ '\n'+
                "Turno: " + turno + '\n'+
                "Adicional Noturno: " + adNoturno;
    }
}
