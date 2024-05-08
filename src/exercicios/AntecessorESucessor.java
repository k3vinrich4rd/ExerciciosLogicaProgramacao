package exercicios;

import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        input.close();

        antecessorSucessor(numero);

    }

    public static void antecessorSucessor(int numero) {

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor de " + numero + " é: " + antecessor);
        System.out.println("Sucessor de " + numero + " é: " + sucessor);
    }
}
