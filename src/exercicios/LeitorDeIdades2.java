package exercicios;

/*15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu,
imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
Consideração o ano com 365 dias e o mês com 30 dias.
(Ex: 5 anos, 2 meses e 15 dias de vida)*/

import java.util.Scanner;

public class LeitorDeIdades2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe em que ano você nasceu: ");
        int idade = input.nextInt();

        idadeAnoMesDia(idade);

        input.close();

    }

    public static void idadeAnoMesDia(int dataDeNascimento) {

        int dataDeNascimentoEmAnos = 2024 - dataDeNascimento;
        int meses = (dataDeNascimentoEmAnos * 12) / 30;
        int dias = meses * 30;

        System.out.println(
            dataDeNascimentoEmAnos + " anos " + meses + " meses " + dias + " dias de vida");

    }
}