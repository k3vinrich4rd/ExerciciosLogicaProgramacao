package exercicios;
/*Construa uma classe que solicite uma frase escrita pelo usuário.
Peça ao usuário para substituí-la essa frase em questão, por outra frase.
(Utilize o método replaceAll()). */

import java.util.Scanner;

public class SubstituirFrase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();

        System.out.println(substituirFrase(frase));

        input.close();

    }

    public static String substituirFrase(String frase) {
        Scanner input = new Scanner(System.in);
        System.out.print("Substitua a frase anterior: ");
        String novaFrase = input.nextLine();
        input.close();
        return frase.replaceAll(frase, novaFrase);
    }

}
