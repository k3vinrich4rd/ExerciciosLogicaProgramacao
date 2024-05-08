package exercicios;

/*7 - Faça um algoritmo que leia dois valores booleanos
(lógicos) e determine se ambos são verdadeiros ou FALSO. */

import java.util.Scanner;

public class LeitorBooleano {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor Booleano: ");
        boolean valorBooleanoA = input.nextBoolean();
        System.out.print("Digite o segundo valor Booleano: ");
        boolean valorBooleanoB = input.nextBoolean();
        input.close();

        var valorBooleano = comparadorBooleano(valorBooleanoA, valorBooleanoB);

        if (valorBooleano) {
            System.out.println("Ambos os valores são VERDADEIROS");
        } else {
            System.out.println("Ambos os valores são FALSOS");
        }
    }

    public static boolean comparadorBooleano(boolean valorBooleanoA, boolean valorBooleanoB) {
        return valorBooleanoA && valorBooleanoB;
    }
}