package exercicios;

import java.util.Scanner;

public class Decrescente {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int terceiroNumero = input.nextInt();

        input.close();

        ordemDecrescente(primeiroNumero, segundoNumero, terceiroNumero);

    }

    public static void ordemDecrescente(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        if (primeiroNumero >= segundoNumero && segundoNumero > terceiroNumero) {
            System.out.println("Ordem decrescente: " + primeiroNumero + ", " + segundoNumero
                + " e " + terceiroNumero);
        } else if (segundoNumero >= primeiroNumero && primeiroNumero > terceiroNumero) {
            System.out.println("Ordem decrescente: " + segundoNumero + ", " + primeiroNumero
                + " e " + terceiroNumero);
        } else if (terceiroNumero >= primeiroNumero && primeiroNumero > segundoNumero) {
            System.out.println("Ordem decrescente: " + terceiroNumero + ", " + primeiroNumero
                + " e " + segundoNumero);
        }
    }

}