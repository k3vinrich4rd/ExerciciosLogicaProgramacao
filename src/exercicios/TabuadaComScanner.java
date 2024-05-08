package exercicios;

import java.util.Scanner;

public class TabuadaComScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para saber a sua tabuada: ");
        int numerador = input.nextInt();
        input.close();

        tabuadaDoDez(numerador);

    }

    public static void tabuadaDoDez(int numerador) {

        int multiple;
        for (int i = 0; i <= numerador; i++) {
            multiple = numerador * i;
            System.out.println(numerador + " x " + i + " = " + multiple);
        }

    }

}