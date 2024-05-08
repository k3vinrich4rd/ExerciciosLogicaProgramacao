package exercicios;

public class MultiplicacaoSemOperadoresLogicos {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        multiplica(a, b);
    }

    public static void multiplica(int a, int b) {

        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }

        System.out.println("Resultado da multiplicação: " + sum);
    }
}
