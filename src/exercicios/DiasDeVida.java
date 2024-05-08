package exercicios;/*Escreva um programa em java para ler o nome e a idade de uma pessoa,
e exibir quantos dias de vida ela possui.
Considere sempre anos completos, e que um ano possui 365 dias.
Ex: uma pessoa com 19 anos possui 6935 dias de vida;
veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS
 */

import java.util.Scanner;

public class DiasDeVida {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();

        input.close();

        var idadeEmDias = idadeEmDias(idade);

        System.out.println(nome + " você viveu " + idadeEmDias + " dias");

    }

    public static int idadeEmDias(int idade) {
        return idade * 365;
    }
}