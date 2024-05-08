package exercicios;

import java.util.Scanner;

/*Faça um programa em java que calcule
e mostre a área de um losango. Sabe-se que: A = (diagonal_maior * diagonal_menor) */
public class Losango {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a diagonal maior: ");
        double diagonalMaior = input.nextDouble();
        System.out.print("Digite a diagonal menor: ");
        double diagonalMenor = input.nextDouble();
        input.close();

        var areaLosango = calculaAreaDoLosango(diagonalMaior, diagonalMenor);

        System.out.println("A área do losango é: " + areaLosango);

    }

    public static double calculaAreaDoLosango(double diagonalMaior, double diagonalMenor) {

        return  (diagonalMaior * diagonalMenor) /2;

    }
}