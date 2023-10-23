package Q_47;

import java.util.Scanner;

public class DemoFuncionario {
    public static void main(String[] ergs){
        Assistente assistente = new Assistente();
        Tecnico tecnico = new Tecnico();
        Administrativo administrativo = new Administrativo();

        Scanner input = new Scanner(System.in);

        String nome, matricula, turno;
        double salario, bonusSalarial, adNoturno, aux1, aux2, decimoT;
        int op;

        do{
            System.out.printf("%nInforme qual a sua função na empresa!");
            System.out.printf("%n[1] para Assistente");
            System.out.printf("%n[2] para Assistente Técnico");
            System.out.printf("%n[3] para Assistente Administrativo");
            System.out.printf("%nOpção: ");
            op = input.nextInt();
        }while(op != 1 && op != 2 && op != 3);

        switch (op){
            case 1:
                System.out.printf("%nASSISTENTE");
                System.out.printf("%nInforme o seu nome: ");
                nome = input.next();
                assistente.setNome(nome);

                System.out.printf("%nInfome o seu salário: ");
                salario = input.nextDouble();
                assistente.setSalario(salario);

                System.out.printf("%nInforme a sua matrícula: ");
                matricula = input.next();
                assistente.setMatricula(matricula);

                aux1 = salario/2;
                aux2 = aux1/2;
                decimoT = aux1 + aux2;

                System.out.println(assistente);
                System.out.printf("Ganho anual: %.2f%n", assistente.ganhoAnual(decimoT));
                break;
            case 2:
                System.out.printf("%nASSISTENTE TÉCNICO");
                System.out.printf("%nInforme o seu nome: ");
                nome = input.next();
                tecnico.setNome(nome);

                System.out.printf("%nInfome o seu salário: ");
                salario = input.nextDouble();
                tecnico.setSalario(salario);

                System.out.printf("%nInforme a sua matrícula: ");
                matricula = input.next();
                tecnico.setMatricula(matricula);

                System.out.printf("%nInforme o seu bônus salarial: ");
                bonusSalarial = input.nextDouble();
                tecnico.setBonusSalarial(bonusSalarial);

                aux1 = salario/2;
                aux2 = aux1/2;
                decimoT = aux1 + aux2;

                System.out.println(tecnico);
                System.out.printf("Ganho anual: %.2f%n", tecnico.ganhoAnual(decimoT));
                break;
            case 3:
                System.out.printf("%nASSISTENTE ADMINISTRATIVO");
                System.out.printf("%nInforme o seu nome: ");
                nome = input.next();
                administrativo.setNome(nome);

                System.out.printf("%nInfome o seu salário: ");
                salario = input.nextDouble();
                administrativo.setSalario(salario);

                System.out.printf("%nInforme a sua matrícula: ");
                matricula = input.next();
                administrativo.setMatricula(matricula);

                System.out.printf("%nInforme o seu turno: ");
                turno = input.next();
                administrativo.setTurno(turno);

                if(turno.equals("noite") || turno.equals("Noite") || turno.equals("NOITE")){
                    System.out.printf("%nInforme o seu adicional noturno: ");
                    adNoturno = input.nextDouble();
                    administrativo.setAdNoturno(adNoturno);
                }
                else{
                    administrativo.setAdNoturno(0);
                }

                aux1 = salario/2;
                aux2 = aux1/2;
                decimoT = aux1 + aux2;

                System.out.println(administrativo);
                System.out.printf("Ganho anual: %.2f%n", administrativo.ganhoAnual(decimoT));
                break;
        }
    }
}
