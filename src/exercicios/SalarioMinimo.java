package exercicios;
/*5 - Faça um algoritmo que leia o valor do salário mínimo
e o valor do salário de um usuário, calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).*/

import java.util.Scanner;

public class SalarioMinimo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do salário minímo: ");
        double salarioMinimo = input.nextDouble();
        System.out.print("Informe o valor do seu salário: ");
        double salarioDoUsuario = input.nextDouble();
        input.close();

        var salariosMinimos = quantidadeSalarioMinimo(salarioMinimo, salarioDoUsuario);

        if (salarioDoUsuario > salarioMinimo) {
            System.out.println(
                (int) salariosMinimos + "SM=R$" + (salarioDoUsuario - salarioMinimo));
        } else {
            System.out.println("Faltam R$" + ((salarioDoUsuario - salarioMinimo) * -1)
                + " reais para você alcançar o salário mínimo");
        }


    }

    public static double quantidadeSalarioMinimo(double salarioMinimo, double salarioDoUsuario) {

        return salarioDoUsuario / salarioMinimo;

    }

}