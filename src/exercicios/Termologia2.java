package exercicios;/*17 - Faça um algoritmo que leia uma temperatura em Fahrenheit
e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
Fórmula: C = (5 * (F-32) / 9)*/

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Termologia2 {

    public static void main(String[] args) {

        BigDecimal fahrenheit = new BigDecimal("89");

        System.out.println("Conversão de Fahrenheit para Celsius: "
            + fahrenheit + "ºF é igual a: " + fahrenheitToCelsius(fahrenheit) + "ºC");

    }

    public static BigDecimal fahrenheitToCelsius(BigDecimal fahrenheit) {

        BigDecimal subtract = fahrenheit.subtract(new BigDecimal("32"));
        BigDecimal divisao = subtract.divide(new BigDecimal("9.0"), RoundingMode.CEILING);
        return divisao.multiply(new BigDecimal("5.0"));

    }

}