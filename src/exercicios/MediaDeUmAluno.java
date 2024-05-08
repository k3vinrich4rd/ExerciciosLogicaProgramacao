package exercicios;

/* 10 - Faça um algoritmo que leia três notas obtidas por um aluno,
 e imprima na tela a média das notas.*/

import java.util.Scanner;

public class MediaDeUmAluno {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua primeira nota: ");
        double primeiraNota = input.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        double segundaNota = input.nextDouble();
        System.out.print("Digite a sua terceira nota: ");
        double terceiraNota = input.nextDouble();

        input.close();

        var mediaDoAluno = mediaDasNotas(primeiraNota, segundaNota, terceiraNota);

        System.out.printf("A média de notas do aluno foi: %.2f", mediaDoAluno);

    }

    public static double mediaDasNotas(double primeiraNota, double segundaNota,
        double terceiraNota) {
        return (primeiraNota + segundaNota + terceiraNota) / 3;
    }

}