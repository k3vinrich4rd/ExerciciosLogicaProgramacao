package exercicios;

/*13 - Faça algoritmo que leia o nome e a idade de uma pessoa
e imprima na tela o nome da pessoa e se ela é maior ou menor de idade. */

import java.util.Scanner;

public class MaiorDeIdade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();

        var maiorIdade = maioridade(idade);

        if (maiorIdade) {
            System.out.println(nome + " você é maior de idade");
        } else {
            System.out.println(nome + " você não é de maior idade");
        }

    }

    public static boolean maioridade(int idade) {
        return idade >= 18;
    }
}