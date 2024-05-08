package exercicios;

import java.util.Scanner;

public class DimensoesDeUmTerreno {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a lado do terreno: ");
        double lado = input.nextDouble();
        System.out.print("Digite a altura do terreno: ");
        double altura = input.nextDouble();

        var dimenssaoDoTerreno = dimenssaoDoTerreno(lado, altura);
        System.out.printf("A dimensão do terreno em questão é: %.2f ", dimenssaoDoTerreno);

    }

    public static double dimenssaoDoTerreno(double lado, double altura) {
        return lado * altura;
    }

}