package exercicios;

/*24 - Faça um algoritmo que calcule a quantidade de litros de combustível
gastos em uma viagem, sabendo que o carro faz 12km com um litro.
Deve-se fornecer ao usuário o tempo que será gasto na viagem
a sua velocidade média, distância percorrida e a quantidade
de litros utilizados para fazer a viagem.

Fórmula: distância = tempo x velocidade.
Litros usados = distância / 12.
 */


public class GastoDeCombustivel {

    public static void main(String[] args) {

        double tempoGastoNaViagem = 3.5;
        double velocidadeMedia = 60.00;

        calculoLitroCombustivel(tempoGastoNaViagem, velocidadeMedia);

    }

    public static void calculoLitroCombustivel(double tempoGastoNaViagem, double velocidadeMedia) {
        double distanciaDoTrajeto = tempoGastoNaViagem * velocidadeMedia;
        double quantidadeDeCombustivelUtilizada = distanciaDoTrajeto / 12;

        System.out.println("Tempo que será gasto na viagem: " + tempoGastoNaViagem + "h "+
            "\nVelocidade média: " + velocidadeMedia + "Km" + "\nDistância percorrida: "
            + distanciaDoTrajeto + "Km" + "\nQuantidade de litros de combustível gastos: "
            + quantidadeDeCombustivelUtilizada + "L");

    }
}