package Q_53;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lista {
    public static void main(String[] args){
        LinkedList<String> lista1 = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i" ,"j"));

        System.out.println("Lista 1: " + lista1);
        System.out.print("Lista 1 invertida: ");
        InverteLista(lista1);

    }

    public static void InverteLista(LinkedList<String> lista){
        ListIterator<String> iterator = lista.listIterator(lista.size());

        while(iterator.hasPrevious()){
            System.out.printf("%s, ", iterator.previous());
        }
    }
}
