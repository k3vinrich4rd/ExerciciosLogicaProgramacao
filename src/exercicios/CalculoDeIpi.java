package exercicios;

/*Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula: (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/

import java.util.Scanner;

public class CalculoDeIpi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a porcentagem de IPI: ");
        double valorIPI = input.nextDouble();
        System.out.print("Informe o código da peça 1: ");
        int codigoDaPecaUm = input.nextInt();
        System.out.print("Informe o valor unitário da peça 1: ");
        double valorUnitarioPecaUm = input.nextDouble();
        System.out.print("Informe a quantidade de peças 1: ");
        int quantidadeDePecasUm = input.nextInt();

        System.out.println();

        System.out.print("Informe o código da peça 2: ");
        int codigoDaPecaDois = input.nextInt();
        System.out.print("Informe o valor unitário da peça 2: ");
        double valorUnitarioPecaDois = input.nextDouble();
        System.out.print("Informe a quantidade de peças 2: ");
        int quantidadeDePecasDois = input.nextInt();

        input.close();

        System.out.println("\nCódigo da primeira peça: " + codigoDaPecaUm + "\n" +
            "Valor unitário da primeira peça: " + valorUnitarioPecaUm + "\n" +
            "Quantidade: " + quantidadeDePecasUm +
            "\nCódigo da segunda peça: " + codigoDaPecaDois + "\n" +
            "Valor unitário da segunda peça: " + valorUnitarioPecaDois + "\n" +
            "Quantidade: " + quantidadeDePecasDois);

        System.out.println("\nValor total a ser pago: " +
            formulaIPi(valorIPI, valorUnitarioPecaUm, quantidadeDePecasUm,
                valorUnitarioPecaDois, quantidadeDePecasDois));

    }

    public static double formulaIPi(double valorIPI, double valorUnitarioPecaUm,
        int quantidadeDePecasUm, double valorUnitarioPecaDois, int quantidadeDePecasDois) {

        return (valorUnitarioPecaUm * quantidadeDePecasUm
            + valorUnitarioPecaDois * quantidadeDePecasDois) * (valorIPI / 100 + 1);

    }
}