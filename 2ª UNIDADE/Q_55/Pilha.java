package Q_55;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args){
        String[] vetor = {"(", ")"};

        int resultado = ehBalanceada(vetor);

        if(resultado == 1){
            System.out.printf("%nEstá balanceado!");
        }
        else{
            System.out.printf("%nNão está balanceado!");
        }
    }

    public static int ehBalanceada(String[] vetor){
        Stack<String> pilha = new Stack<>();
        int aux = 1;
        String topoPilha;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i].equals("(")){
                pilha.push(vetor[i]);
            }
            else if(pilha.size() == 0){
                aux = 0;
                break;
            }
            else{
                topoPilha = pilha.peek();
                pilha.pop();
                if(vetor[i].equals(")") && !topoPilha.equals("(")){
                    aux = 0;
                }
            }
        }

        if(pilha.size() > 0){
            aux = 0;
        }
        return aux;
    }
}
