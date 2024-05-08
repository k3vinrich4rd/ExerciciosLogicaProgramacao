package exercicios;

import java.util.Scanner;

public class InversaoDeValores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Valor A: ");
        double valorA = input.nextDouble();
        System.out.print("Valor B: ");
        double valorB = input.nextDouble();

        inversao(valorA, valorB);

    }

    public static void inversao(double valorA, double valorB) {

        var valorC = valorA;
        valorA = valorB;
        valorB = valorC;

        System.out.println("Valor A: " + valorA);
        System.out.println("Valor B: " + valorB);
    }

}