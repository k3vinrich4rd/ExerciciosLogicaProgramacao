package exercicios;

import java.util.Scanner;

/*3 - Faça um algoritmo que leia dois valores inteiros A e B,
se os valores de A e B forem iguais, deverá somar os dois valores */
public class SomaDeValores2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valoA: ");
        int valorA = input.nextInt();
        System.out.print("Digite o valoB: ");
        int valorB = input.nextInt();

        input.close();

        var comparador = comparador(valorA, valorB);

        if (valorA == valorB) {
            System.out.println("\nOs valores são equivalentes\n"
                + "O resultado da soma dos valores é: " + comparador);
        } else {
            System.out.println("\nOs valores " + valorA + " e " + valorB + " são diferentes\n"
                + "O resultado da multiplicação dos valores é: " + comparador);
        }

    }

    public static int comparador(int valorA, int valorB) {

        int c;
        if (valorA == valorB) {
            c = valorA + valorB;
        } else {
            c = valorA * valorB;
        }
        return c;
    }

}