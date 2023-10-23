package Q_40;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteTeste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Cliente> cadastroCliente = new ArrayList<>();

        int id;
        String nome;
        int idade;
        int telefone;

        while (true){
            System.out.printf("%nInforme o seu ID: ");
            id = input.nextInt();
            if(id < 0){
                break;
            }
            System.out.printf("%nInforme o seu Nome: ");
            nome = input.next();

            System.out.printf("%nInforme a sua Idade: ");
            idade = input.nextInt();

            System.out.printf("%nInforme o seu Telefone: ");
            telefone = input.nextInt();

            cadastroCliente.add(new Cliente(id, nome, idade, telefone)); // Adiciona um novo objeto para o ArreyList a cada iteração
        }

        for(int i = 0; i < cadastroCliente.size(); i++){
            cadastroCliente.get(i).imprime();
            System.out.println();
        }
    }
}
