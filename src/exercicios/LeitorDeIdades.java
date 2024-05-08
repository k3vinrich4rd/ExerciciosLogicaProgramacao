package exercicios;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Considere o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

import java.util.Scanner;

public class LeitorDeIdades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua idade em anos: ");
        int ano = input.nextInt();
        System.out.print("Digite a sua idade em meses: ");
        int meses = input.nextInt();
        System.out.print("Digite a sua idade em dias: ");
        int dias = input.nextInt();

        var idadeEmAnoMesDia = idadeAnoMesDia(ano, meses, dias);

        System.out.println(ano + " anos, " + meses + " meses e " + dias + " dias"
            + " = " + idadeEmAnoMesDia + " dias");

        input.close();

    }

    public static int idadeAnoMesDia(int ano, int mes, int dia) {

        int calculoAno = 365 * ano;
        int calculoMes = 30 * mes;
        return calculoAno + calculoMes + dia;
    }

}