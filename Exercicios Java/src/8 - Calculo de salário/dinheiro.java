import java.util.Scanner;

public class dinheiro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dinheiro que você rescebe a hora ");

        double dinheirohora = sc.nextDouble();

        System.out.println("Informe as horas trabalhadas no dia para calcular o quanto você ganha de dinheiro o dia");

        double horastrabalhadas = sc.nextDouble();

        double horasmes = 21 * horastrabalhadas;
        System.out.println("As horas  no mês trabalhada foi de " + (horasmes) + "Horas");

        // DINHEIRO AO FINAL DO DIA NA VARIAVEL ABAIXO
        double finaldia = dinheirohora * horastrabalhadas;

        System.out.println("O TOTAL GANHHO NO DIA FOI DE  " + (finaldia) + " REAIS");
        System.out.println("E o seu salario foi de " + (finaldia * 21));

    }

}
