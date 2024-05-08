
package exercicios;

public class TabuadaDoUmAoDez {

    public static void main(String[] args) {
        int numerador = 1;

       tabuadaDoDez(numerador);

    }

    public static void tabuadaDoDez(int numerador) {

        int multiple;
        for (int i = numerador; i <= 10; i++) {
            multiple = numerador * i;
            System.out.println(numerador + " x " + i + " = " + multiple);
        }

    }

}