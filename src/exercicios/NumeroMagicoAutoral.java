package exercicios;

public class NumeroMagicoAutoral {

    public static void main(String[] args) {

        String input = "1234558";
        System.out.println(isMagicNumber(input));


    }

    public static boolean isMagicNumber(String input) {

        char[] inputToChar = input.toCharArray();
        int sum;
        do {
            sum = 0;
            for (char values : inputToChar) {
                sum += Character.getNumericValue(values);
            }
            inputToChar = String.valueOf(sum).toCharArray();

        } while (sum > 9);

        if (!(sum == 1)) {
            System.out.println("A sequência de números digitados " + input + " não é um número mágico");
        } else {
            System.out.println("A sequência de números digitados " + input + " é um número mágico");
        }
        return true;
    }
}