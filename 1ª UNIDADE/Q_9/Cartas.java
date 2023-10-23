package Q_9;

import java.util.Scanner;

public class Cartas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int valor, naipe;

        System.out.printf("%nInforme o valor da carta: ");
        valor = input.nextInt();

        System.out.printf("%nInforem o naipe da carta: ");
        naipe = input.nextInt();

        switch(naipe){
            case 1: // ouros
                if(naipe == 1){
                    System.out.printf("%n%n1 de ouros!");
                }
                else if(naipe == 2){
                    System.out.printf("%n%n2 de ouros!");
                }
                else if(naipe == 3){
                    System.out.printf("%n%n3 de ouros!");
                }
                else if(naipe == 4){
                    System.out.printf("%n%n4 de ouros!");
                }
                else if(naipe == 5){
                    System.out.printf("%n%n5 de ouros!");
                }
                else if(naipe == 6){
                    System.out.printf("%n%n6 de ouros!");
                }
                else if(naipe == 7){
                    System.out.printf("%n%n7 de ouros!");
                }
                else if(naipe == 8){
                    System.out.printf("%n%n8 de ouros!");
                }
                else if(naipe == 9){
                    System.out.printf("%n%n9 de ouros!");
                }
                else if(naipe == 10){
                    System.out.printf("%n%n10 de ouros!");
                }
                else if(naipe == 11){
                    System.out.printf("%n%nValete!");
                }
                else if(naipe == 12){
                    System.out.printf("%n%nDama!");
                }
                else if(naipe == 13){
                    System.out.printf("%n%nRei!");
                }
                else{
                    System.out.printf("%n%nEssa carta não existe!");
                }
                break;
            case 2: // paus
                if(naipe == 1){
                    System.out.printf("%n%n1 de paus!");
                }
                else if(naipe == 2){
                    System.out.printf("%n%n2 de paus!");
                }
                else if(naipe == 3){
                    System.out.printf("%n%n3 de paus!");
                }
                else if(naipe == 4){
                    System.out.printf("%n%n4 de paus!");
                }
                else if(naipe == 5){
                    System.out.printf("%n%n5 de paus!");
                }
                else if(naipe == 6){
                    System.out.printf("%n%n6 de paus!");
                }
                else if(naipe == 7){
                    System.out.printf("%n%n7 de paus!");
                }
                else if(naipe == 8){
                    System.out.printf("%n%n8 de paus!");
                }
                else if(naipe == 9){
                    System.out.printf("%n%n9 de paus!");
                }
                else if(naipe == 10){
                    System.out.printf("%n%n10 de paus!");
                }
                else if(naipe == 11){
                    System.out.printf("%n%nValete!");
                }
                else if(naipe == 12){
                    System.out.printf("%n%nDama!");
                }
                else if(naipe == 13){
                    System.out.printf("%n%nRei!");
                }
                else{
                    System.out.printf("%n%nEssa carta não existe!");
                }
                break;
            case 3: // copas
                if(naipe == 1){
                    System.out.printf("%n%n1 de copas!");
                }
                else if(naipe == 2){
                    System.out.printf("%n%n2 de copas!");
                }
                else if(naipe == 3){
                    System.out.printf("%n%n3 de copas!");
                }
                else if(naipe == 4){
                    System.out.printf("%n%n4 de copas!");
                }
                else if(naipe == 5){
                    System.out.printf("%n%n5 de copas!");
                }
                else if(naipe == 6){
                    System.out.printf("%n%n6 de copas!");
                }
                else if(naipe == 7){
                    System.out.printf("%n%n7 de copas!");
                }
                else if(naipe == 8){
                    System.out.printf("%n%n8 de copas!");
                }
                else if(naipe == 9){
                    System.out.printf("%n%n9 de copas!");
                }
                else if(naipe == 10){
                    System.out.printf("%n%n10 de copas!");
                }
                else if(naipe == 11){
                    System.out.printf("%n%nValete!");
                }
                else if(naipe == 12){
                    System.out.printf("%n%nDama!");
                }
                else if(naipe == 13){
                    System.out.printf("%n%nRei!");
                }
                else{
                    System.out.printf("%n%nEssa carta não existe!");
                }
                break;
            case 4: // espadas
                if(naipe == 1){
                    System.out.printf("%n%n1 de espadas!");
                }
                else if(naipe == 2){
                    System.out.printf("%n%n2 de espadas!");
                }
                else if(naipe == 3){
                    System.out.printf("%n%n3 de espadas!");
                }
                else if(naipe == 4){
                    System.out.printf("%n%n4 de espadas!");
                }
                else if(naipe == 5){
                    System.out.printf("%n%n5 de espadas!");
                }
                else if(naipe == 6){
                    System.out.printf("%n%n6 de espadas!");
                }
                else if(naipe == 7){
                    System.out.printf("%n%n7 de espadas!");
                }
                else if(naipe == 8){
                    System.out.printf("%n%n8 de espadas!");
                }
                else if(naipe == 9){
                    System.out.printf("%n%n9 de espadas!");
                }
                else if(naipe == 10){
                    System.out.printf("%n%n10 de espadas!");
                }
                else if(naipe == 11){
                    System.out.printf("%n%nValete!");
                }
                else if(naipe == 12){
                    System.out.printf("%n%nDama!");
                }
                else if(naipe == 13){
                    System.out.printf("%n%nRei!");
                }
                else{
                    System.out.printf("%n%nEssa carta não existe!");
                }
                break;
            default:
                System.out.printf("%n%nEsse naipe não existe!");
        }
    }
}
