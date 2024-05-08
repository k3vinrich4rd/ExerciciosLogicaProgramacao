package exercicios;

public class NumeroMagico {
    public static void main(String[] args) {

        String input = "2345689";
        System.out.println(isNumberMagic(input));
    }

    public static boolean isNumberMagic(String input) {

        char[] inputToChar = input.toCharArray();
        int sum;

        do {
            sum = 0;
            for (char valuesInput : inputToChar) {
                sum += Character.getNumericValue(valuesInput);
            }
            inputToChar = String.valueOf(sum).toCharArray();
        } while (sum > 9);

        if (!(sum == 1)) {
            System.out.println("A sequência de número(s) digitados " + input + " não é um número mágico");
            return false;
        } else {
            System.out.println("A sequência de número(s) digitados " + input + " é um número mágico");
            return true;
        }
    }
}
