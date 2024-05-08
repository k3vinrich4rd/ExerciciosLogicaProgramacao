package exercicios;

/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias*/
public class SomaDeMediasAritmetica {

    public static void main(String[] args) {

        int a = 8;
        int b = 9;
        int c = 7;

        int d = 4;
        int e = 5;
        int f = 6;

        System.out.println("O resultado da média aritmética dos números "
            + a + "," + b + " e " + c + " é: " + primeiraMediaDosNumeros(a, b, c));

        System.out.println("O resultado da média aritmética dos números "
            + d + "," + e + " e " + f + " é: " + segundaMediaDosNumeros(d, e, f));

        System.out.println("O resultado da soma das duas médias é: "
            + somaDasMedias(a, b, c, d, e, f));

        System.out.println("O resultado da média aritmética das médias é: "
            + mediaAritmeticaDasMedias(a, b, c, d, e, f));
    }

    public static int primeiraMediaDosNumeros(int a, int b, int c) {

        return (a + b + c) / 3;

    }

    public static int segundaMediaDosNumeros(int d, int e, int f) {

        return (d + e + f) / 3;

    }

    public static int somaDasMedias(int a, int b, int c, int d, int e, int f) {

        return (a + b + c + d + e + f);

    }

    public static int mediaAritmeticaDasMedias(int a, int b, int c, int d, int e, int f) {

        return (a + b + c + d + e + f) / 2;

    }

}