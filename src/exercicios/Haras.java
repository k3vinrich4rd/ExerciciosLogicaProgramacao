package exercicios;

import java.util.Scanner;

/* Faça um programa em java para calcular quantas ferraduras são necessárias
para equipar todos os cavalos comprados para um haras.
A informação de cavalos comprados deve ser informada pelo usuário. */
public class Haras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantos cavalos tem no haras: ");
        int numeroDeCavalos = input.nextInt();
        input.close();

        var calculoDeFerraduras = calculoDeFerraduras(numeroDeCavalos);

        System.out.println("Será necessário " + calculoDeFerraduras +
            " ferraduras para equipar os cavalos");

    }

    public static int calculoDeFerraduras(int numeroDeCavalos) {
        return numeroDeCavalos * 4;
    }

}