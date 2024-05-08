package exercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Termologia {

    public static void main(String[] args) {

        BigDecimal celsius = new BigDecimal("36");

        BigDecimal fahrenheit = new BigDecimal("89");

        BigDecimal kelvin = new BigDecimal("373");

        System.out.println("Conversão de Celsius para Fahrenheit: "
            + celsius + "ºC é igual a: " + toFahrenheitPrimeiraFormula(celsius) + "ºF");

        System.out.println("\nConversão de Celsius para Fahrenheit: "
            + celsius + "ºC é igual a: " + toFahrenheitSegundaFormula(celsius) + "ºF");

        System.out.println("\nConversão de Fahrenheit para Celsius: "
            + fahrenheit + "ºF é igual a: " + fahrenheitToCelsius(fahrenheit) + "ºC");

        System.out.println("\nConversão de Kelvin para Celsius: "
            + kelvin + "K é igual a: " + kelvinToCelsius(kelvin) + "ºC");

        System.out.println("\nConversão de Kelvin para Fahrenheit: "
            + kelvin + "K é igual a: " + kelvinToFahrenheit(kelvin) + "ºF");
    }

    public static BigDecimal toFahrenheitPrimeiraFormula(BigDecimal celsius) {

        BigDecimal divide = celsius.divide(new BigDecimal("5"));
        BigDecimal temperaturaEmFahrenheit = divide.multiply(new BigDecimal("9"));
        return temperaturaEmFahrenheit.add(new BigDecimal("32"));

    }

    public static BigDecimal toFahrenheitSegundaFormula(BigDecimal celsius) {

        BigDecimal temperaturaFahrenheit = celsius.multiply(new BigDecimal("1.8"));
        return temperaturaFahrenheit.add(new BigDecimal("32"));
    }

    public static BigDecimal fahrenheitToCelsius(BigDecimal fahrenheit) {

        BigDecimal subtract = fahrenheit.subtract(new BigDecimal("32"));
        BigDecimal divisao = subtract.divide(new BigDecimal("9.0"), RoundingMode.CEILING);
        return divisao.multiply(new BigDecimal("5.0"));

    }

    public static BigDecimal kelvinToCelsius(BigDecimal kelvin) {

        BigDecimal subtract = kelvin.subtract(new BigDecimal("273"));
        BigDecimal divisao = subtract.divide(new BigDecimal("5.0"));
        return divisao.multiply(new BigDecimal("5.0"));

    }

    public static BigDecimal kelvinToFahrenheit(BigDecimal kelvin) {

        BigDecimal subtract = kelvin.subtract(new BigDecimal("273"));
        BigDecimal divisao = subtract.divide(new BigDecimal("5.0"));
        BigDecimal multiply = divisao.multiply(new BigDecimal("9"));
        return multiply.add(new BigDecimal("32"));
    }
}