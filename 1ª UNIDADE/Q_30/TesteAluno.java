package Q_30;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String matricula;
        String nome;
        double n1Prova;
        double n2Prova;
        double notaTrabalho;

        Aluno aluno = new Aluno();
        //Aluno aluno2 = new Aluno("123445", "Davi", 5.5,5.8, 10.0); // TESTE

        System.out.printf("%nInfomre o seu nome: ");
        nome = input.nextLine();
        aluno.setNome(nome);

        System.out.printf("%nInforme a sua matricula: ");
        matricula = input.nextLine();
        aluno.setMatricula(matricula);

        System.out.printf("%nInforme a nota da prova 1: ");
        n1Prova = input.nextDouble();
        aluno.setN1Prova(n1Prova);

        System.out.printf("%nInforme a nota da prova 2: ");
        n2Prova = input.nextDouble();
        aluno.setN2Prova(n2Prova);

        System.out.printf("%nInforme a nota da prova 1: ");
        notaTrabalho = input.nextDouble();
        aluno.setNotaTrabalho(notaTrabalho);

        display(aluno);
        //display(aluno2);
    }

    public static void display(Aluno aluno){
        System.out.printf("%nNome: %s", aluno.getNome());
        System.out.printf("%nMatrícula: %s", aluno.getMatricula());
        System.out.printf("%nProva 1: %.2f", aluno.getN1Prova());
        System.out.printf("%nProva 2: %.2f", aluno.getN2Prova());
        System.out.printf("%nTrabalho: %.2f", aluno.getNotaTrabalho());
        System.out.printf("%nMédia: %.2f", aluno.media(aluno.getN1Prova(), aluno.getN2Prova(), aluno.getNotaTrabalho()));
        System.out.printf("%nVocê precisa de %.2f na prova final", aluno.provaFinal(aluno.getN1Prova(), aluno.getN2Prova(), aluno.getNotaTrabalho()));

    }
}
