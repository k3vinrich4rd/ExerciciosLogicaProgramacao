package exercicios;

/*23 - Faça um algoritmo que efetue o cálculo do salário líquido
de um professor. As informações fornecidas serão:
valor da hora aula, número de aulas lecionadas
no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.*/

public class SalarioLiquido {

    public static void main(String[] args) {

        double valorDaHoraAula = 65.00;
        int numeroDeAulasLecionadasNoMes = 4;
        double percentualDescontoInss = 0.15;

        var salarioLiquido = calculoSalarioLiquido(valorDaHoraAula,
            numeroDeAulasLecionadasNoMes, percentualDescontoInss);

        System.out.printf("O salário liquído do professor será: R$ %.2f ", salarioLiquido);

    }

    public static double calculoSalarioLiquido(double valorDaHoraAula,
        int numeroDeAulasLecionadas, double percentualDescontoInss) {

        double faturamentoPorHoraTrabalhaNoDia = valorDaHoraAula * 8;
        double faturamentoNoMes = faturamentoPorHoraTrabalhaNoDia * numeroDeAulasLecionadas;
        double descontoSalarial = faturamentoNoMes * percentualDescontoInss;
        return faturamentoNoMes - descontoSalarial;

    }

}