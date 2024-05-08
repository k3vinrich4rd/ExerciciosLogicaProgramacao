package exercicios;

/*18 - Francisco tem 1,50m e cresce 2 centímetros por ano,
enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
Faça um algoritmo que calcule e imprima na tela
em quantos anos serão necessários para que Sara seja maior que Francisco. */

public class FranciscoESara {

    public static void main(String[] args) {

        double alturaDeFrancisco = 1.50;
        double alturaDeSara = 1.10;

        var ano = calculoAltura(alturaDeFrancisco, alturaDeSara);
        System.out.println("Será necessário passar " + ano + " anos para Sara ser maior que Francisco");
    }

    public static int calculoAltura(double alturaDeFrancisco, double alturaDeSara){
        int anos = 0;
        while (alturaDeFrancisco > alturaDeSara) {
            alturaDeSara += 0.3;
            alturaDeFrancisco += 0.2;
            anos++;
        }
        return anos;
    }
}