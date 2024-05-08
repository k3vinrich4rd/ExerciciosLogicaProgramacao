package exercicios;

/*Faça um programa em Java que peça ao usuário
para digitar um texto e informe quantos caracteres
possui o texto informado pelo usuário. (Utilize o método length()).*/

import java.util.Scanner;

public class QuantidadeDeCaracteres {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = input.nextLine();

        var caracteresDoTexto = quantidadeDeCaracteres(texto);
        System.out.println("O texto digitado tem: " + caracteresDoTexto + " caracteres");

    }

    public static int quantidadeDeCaracteres(String texto) {

        return texto.length();

    }

}