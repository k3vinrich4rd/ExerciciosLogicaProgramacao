package exercicios;

 /*
12 - Faça um algoritmo que leia o valor de um produto e determine o
valor que deve ser pago, conforme a escolha da forma de pagamento
pelo comprador e imprima na tela o valor final do produto a ser pago.
Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

Tabela de Código de Condições de Pagamento
 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 2 - À Vista no cartão de crédito, recebe 10% de desconto
 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 4 - "Parcelado no cartão em três vezes" ou mais, preço normal do produto mais juros de 10%*/


import java.util.Scanner;

public class ProdutoFormaDePagamento {

    public static void main(String[] args) {

        double mesa = 200.00;
        System.out.println("O valor da mesa é: " + mesa);

        System.out.println("Tabela de Código de Condições de Pagamento:");
        System.out.println(
            "\nDigite '1' - Para pagar á Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("Digite '2' - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println(
            "Digite '3' - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("Digite '4' Parcelado no cartão em três vezes"
            + " ou mais, preço normal do produto mais juros de 10%");

        Scanner input = new Scanner(System.in);
        System.out.print("\nInforme a forma de pagamento do produto: ");
        int formaDePagamento = input.nextInt();
        input.close();

        var meioDePagamento = condicoesPagamento(formaDePagamento, mesa);

        System.out.println("De acordo com a sua escolha de forma de pagamento\n"
            + "O valor final a ser pago será: " + meioDePagamento);

    }

    public static double condicoesPagamento(int formaDePagamento, double valorProduto) {

        double desconto;
        double juros;

        switch (formaDePagamento) {
            case 1:
                desconto = valorProduto * 0.15;
                valorProduto = valorProduto - desconto;
                return valorProduto;
            case 2:
                desconto = valorProduto * 0.10;
                valorProduto = valorProduto - desconto;
                return valorProduto;
            case 4:
                juros = valorProduto * 0.10;
                valorProduto = valorProduto + juros;
                return valorProduto;
            default:
                return valorProduto;
        }
    }

}