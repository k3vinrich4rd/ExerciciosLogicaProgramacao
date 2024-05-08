package exercicios;

/* 11 -Faça um algoritmo que leia quatro notas obtidas por um aluno,
 calcule a média das notas obtidas, imprima na tela o nome do aluno e
 Se o aluno foi aprovado ou reprovado. Para o aluno ser considerado
 aprovado sua média final deve ser maior ou igual a 7.*/

import java.util.Scanner;

public class MediaDeUmAluno2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite a sua primeira nota: ");
        double primeiraNota = input.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        double segundaNota = input.nextDouble();
        System.out.print("Digite a sua terceira nota: ");
        double terceiraNota = input.nextDouble();
        System.out.print("Digite a sua quarta nota: ");
        double quartaNota = input.nextDouble();
        input.close();

        var aprovado = isAprovado(primeiraNota, segundaNota, terceiraNota, quartaNota);
        var mediaDaNota = mediaDasNotas(primeiraNota, segundaNota, terceiraNota, quartaNota);

        if (aprovado) {
            System.out.println("O Aluno " + nome + " foi aprovado, pois a sua média"
                + " de notas é superior a 7\n" +
                "Valor da média: " + mediaDaNota);
        } else {
            System.out.println("O Aluno " + nome + " foi reprovado, pois a sua média"
                + " de notas é inferior a 7\n" +
                "Valor da média: " + mediaDaNota);
        }

    }

    public static double mediaDasNotas(double primeiraNota, double segundaNota,
        double terceiraNota, double quartaNota) {
        return (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
    }

    public static boolean isAprovado(double primeiraNota, double segundaNota,
        double terceiraNota, double quartaNota) {

        double mediaDoAluno = mediaDasNotas(primeiraNota, segundaNota, terceiraNota, quartaNota);
        return mediaDoAluno >= 7.0;

    }

}