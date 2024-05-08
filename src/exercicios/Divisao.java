package exercicios;

import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int valorA = input.nextInt();
        System.out.print("Digite o valo de B: ");
        int valorB = input.nextInt();

        divisao(valorA, valorB);

    }

    public static void divisao(int valorA, int valorB) {

        int quociente = 0;

        if (valorA < valorB) {
            System.out.println("Impossível efetuar a divisão");
        } else {
            while (valorA >= valorB) {
                quociente++;
                valorA -= valorB;
            }
            System.out.println("Resultado da divisão: " + quociente
                    + "\nResto da divisão: " + valorA);

        }
    }
}