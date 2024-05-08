package exercicios;

public class CalculadoraSemOperadoresLogicos {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        dividir(a, b);

        multiplicar(a, b);
    }

    public static void dividir(int a, int b) {
        int quociente = 0;
        while (a >= b) {
            quociente++;
            a -= b;
        }

        System.out.println("Quociente da divisão = " + quociente);
        System.out.println("Resto da divisão = " + a);
    }

    public static void multiplicar(int a, int b) {

        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        System.out.println("Resultado da multiplicação: " + resultado);
    }
}
