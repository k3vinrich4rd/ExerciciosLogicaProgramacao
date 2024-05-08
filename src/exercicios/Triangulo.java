package exercicios;/*16 - Faça um algoritmo que leia três valores
que representam os três lados de um triângulo
e verifique se são válidos, determine se o triângulo é
equilátero, isósceles ou escaleno.

Informação: A soma dos ângulos internos de qualquer triângulo
é 180.º. Um triângulo é chamado de equilátero se todos os lados
possuem a mesma medida. Um triângulo é chamado de isósceles
se dois lados possuem a mesma medida. Um triângulo
é chamado de escaleno se todos os lados possuem medidas diferentes.*/

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe a medida A do triângulo: ");
        double medidaA = input.nextDouble();
        System.out.print("Informe a medida B do triângulo: ");
        double medidaB = input.nextDouble();
        System.out.print("Informe a medida C do triângulo: ");
        double medidaC = input.nextDouble();

        input.close();

        triangulo(medidaA, medidaB, medidaC);
    }

    public static void triangulo(double medidaA, double medidaB, double medidaC) {

        if (medidaB == medidaA && medidaB == medidaC ||
                medidaC == medidaA && medidaC == medidaB) {
            System.out.println("O triângulo é equilátero");

        } else if (medidaB == medidaA || medidaB == medidaC || medidaC == medidaA) {
            System.out.println("O triângulo é isósceles");

        } else {
            System.out.println("O triângulo é escaleno");
        }
    }


}