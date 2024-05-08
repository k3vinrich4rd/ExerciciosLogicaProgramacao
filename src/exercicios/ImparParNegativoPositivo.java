package exercicios;

/* 2 - Faça um algoritmo para receber um número qualquer e imprimir
na tela se o número é par ou ímpar, positivo ou negativo.*/

import java.util.Scanner;

public class ImparParNegativoPositivo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = input.nextDouble();
        input.close();

        var par = isPair(numero);
        var positivo = isPositive(numero);

        if (par) {
            System.out.println("\nO número " + numero + " é par");
        } else {
            System.out.println("\nO número " + numero + " é ímpar");
        }

        if (positivo) {
            System.out.println("\nO número " + numero + " é positivo");
        } else {
            System.out.println("\nO número " + numero + " é negativo");
        }

    }

    public static boolean isPair(double numero) {
        return numero % 2 == 0;
    }

    public static boolean isPositive(double numero) {
        return numero >= 0;
    }

}