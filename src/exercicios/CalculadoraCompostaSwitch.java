package exercicios;

import java.util.Scanner;

public class CalculadoraCompostaSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite '1' para somar dois números ");
        System.out.println("Digite '2' para multiplicar dois números");
        System.out.println("Digite '3' para subtrair dois números");
        System.out.println("Digite '4' para dividir dois números");

        System.out.print("\nNumero escolhido: ");
        int resposta = input.nextInt();

        calculadoraComposta(resposta);

    }

    public static void calculadoraComposta(int resposta) {

        Scanner input = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        int soma;
        int multiplicacao;
        int subtracao;
        int divisao;


        switch (resposta) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                primeiroNumero = input.nextInt();
                System.out.print("Digite o segundo número: ");
                segundoNumero = input.nextInt();
                soma = primeiroNumero + segundoNumero;
                System.out.println("Resultado da soma: " + soma);
                break;
            case 2:
                System.out.print("Digite o primeiro número: ");
                primeiroNumero = input.nextInt();
                System.out.print("Digite o segundo número: ");
                segundoNumero = input.nextInt();
                multiplicacao = primeiroNumero * segundoNumero;
                System.out.println("Resultado da multiplicação: " + multiplicacao);
                break;
            case 3:
                System.out.print("Digite o primeiro número: ");
                primeiroNumero = input.nextInt();
                System.out.print("Digite o segundo número:");
                segundoNumero = input.nextInt();
                subtracao = primeiroNumero - segundoNumero;
                System.out.println("Resultado da subtração: " + subtracao);
                break;
            case 4:
                System.out.print("Digite o primeiro número: ");
                primeiroNumero = input.nextInt();
                System.out.println("Digite o segundo número: ");
                segundoNumero = input.nextInt();
                divisao = primeiroNumero / segundoNumero;
                System.out.println("Resultado da divisão: " + divisao);
                break;
            default:
                while (resposta > 4||
                resposta <= 0 ) {
                    System.out.println("Digite '1' para somar dois números ");
                    System.out.println("Digite '2' para multiplicar dois números");
                    System.out.println("Digite '3' para subtrair dois números");
                    System.out.println("Digite '4' para dividir dois números");

                    System.out.print("\nNumero escolhido: ");
                    resposta = input.nextInt();
                }
                break;
        }
        input.close();
    }
}
