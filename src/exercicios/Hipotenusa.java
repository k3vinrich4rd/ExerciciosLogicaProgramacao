package exercicios;

import java.util.Scanner;

/*Faça um programa em java que receba o valor dos catetos a e b
de um triângulo, calcule e mostre o valor da hipotenusa. Fórmula (h = )

 */
public class Hipotenusa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro cateto do triângulo retângulo: ");
        double primeiroCateto = input.nextDouble();
        System.out.print("Digite o segundo cateto do triângulo retângulo: ");
        double segundoCateto = input.nextDouble();
        input.close();

        var hipotenusa = calculaHipotenusa(primeiroCateto, segundoCateto);

        System.out.println("O valor da hipotenusa do triângulo é: " + hipotenusa);

    }

    public static double calculaHipotenusa(double primeiroCateto, double segundoCateto) {
        double hipotenusa = Math.pow(primeiroCateto, 2) + Math.pow(segundoCateto, 2);
        return Math.sqrt(hipotenusa);

    }
}