package exercicios;/*21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.*/

import java.util.Random;

public class ValorAleatorio {

    public static void main(String[] args) {
        System.out.println("O número aleatório gerado de 0 a 100 foi: " + randomNumber());
    }

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }
}