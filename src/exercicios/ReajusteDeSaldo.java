package exercicios;

/*6 - Faça um algoritmo que leia um valor qualquer
e imprima na tela com um reajuste de 5%.*/

import java.util.Scanner;

public class ReajusteDeSaldo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe um saldo: ");
        double saldo = input.nextDouble();

        input.close();

        var reajusteSalarial = reajusteDeUmPorCentoNoSaldo(saldo);

        System.out.println("Saldo antes do reajuste: " + saldo);
        System.out.println("Saldo após reajuste de 5%: " + reajusteSalarial);

    }

    public static double reajusteDeUmPorCentoNoSaldo(double saldo) {

        double reajusteSalarial = saldo * 0.05;
        return saldo + reajusteSalarial;

    }

}