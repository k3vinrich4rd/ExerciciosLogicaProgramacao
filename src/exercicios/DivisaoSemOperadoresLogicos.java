package exercicios;

public class DivisaoSemOperadoresLogicos {
    public static void main(String[] args) {

        int a = 6;
        int b = 2;

       dividir(a,b);

    }

    public static void dividir(int a, int b) {

        int quociente = 0;
        while (a >= b ) {
            quociente ++;
            a -= b;
        }

        System.out.println("Resultado da divisão: " + quociente);
        System.out.println("Resto da divisão: " + a);
    }

}
