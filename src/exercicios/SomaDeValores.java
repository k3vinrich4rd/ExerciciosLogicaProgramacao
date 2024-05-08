package exercicios;

import java.util.Scanner;

/* 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida
 imprima na tela a soma entre A e B é mostre se a soma é menor que C.*/
public class SomaDeValores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int valorA = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int valorB = input.nextInt();
        System.out.print("Digite o valor de C: ");
        int valorC = input.nextInt();

        var adicaoDeValores = somaDeValores(valorA, valorB, valorC);



        if ((valorA + valorB > valorC)) {
            System.out.println("\nA soma entre o valor A e valor B, é maior que o valor C \n"
                + "Resultado: " + adicaoDeValores);
        } else {
            System.out.println("\nO valor C é maior do que soma do valor A e valor B \n"
                + "Resultado: " + adicaoDeValores);
        }
        input.close();
    }

    public static int somaDeValores(int valorA, int valorB, int valorC) {

        int somaDeVAlorAEB = valorA + valorB;
        return Math.max(somaDeVAlorAEB, valorC);
    }
}