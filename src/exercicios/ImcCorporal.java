package exercicios;

/* 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal)
de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
conforme a tabela abaixo:

Fórmula do IMC = peso / (altura) ²
Tabela Condições IMC

Abaixo de 18,5 | Abaixo do peso
Entre 18,6 e 24,9 | Peso ideal (parabéns)
Entre 25,0 e 29,9 | Levemente acima do peso
Entre 30,0 e 34,9 | Obesidade, grau I
Entre 35,0 e 39,9 | Obesidade, grau II (severa)
Maior ou igual a 40 | Obesidade, grau III (mórbida)*/

import java.util.Scanner;

public class ImcCorporal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double pesoCorporal = input.nextDouble();
        System.out.print("Digite a sua altura: ");
        double altura = input.nextDouble();

        var imc = calculoImc(pesoCorporal, altura);
        System.out.printf("Seu imc é: %.2f ", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal (parabéns)");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc > 29.9 && imc <= 34.9) {
            System.out.println("Obesidade, grau I ");
        } else if (imc > 34.9 && imc <= 39.9) {
            System.out.println("Obesidade, grau II (severa)");
        } else {
            System.out.println("Obesidade, grau III (mórbida)");
        }

    }

    public static double calculoImc(double pesoCorporal, double altura) {

        return pesoCorporal / Math.pow(altura, 2);

    }

}