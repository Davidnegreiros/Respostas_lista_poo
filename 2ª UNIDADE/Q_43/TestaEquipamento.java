package Q_43;

import java.util.Scanner;

public class TestaEquipamento {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Equipamento equipamento = new Equipamento();
        Computador computador = new Computador();

        String cpu, gpu, marca, modelo;

        System.out.printf("%nImforme a CPU: ");
        cpu = input.nextLine();
        equipamento.setCpu(cpu);
        computador.setCpu(cpu);

        System.out.printf("%nImforme a GPU: ");
        gpu = input.nextLine();
        equipamento.setGpu(gpu);
        computador.setGpu(gpu);

        System.out.printf("%nImforme a Marca: ");
        marca = input.next();
        computador.setMarca(marca);

        System.out.printf("%nImforme o Modelo: ");
        modelo = input.next();
        computador.setModelo(modelo);

        System.out.println();

        System.out.println("Equipamentos");
        System.out.println(equipamento);

        System.out.println("Computador");
        System.out.println(computador);
    }
}
