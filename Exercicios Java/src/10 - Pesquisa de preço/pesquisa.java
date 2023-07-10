import java.util.Scanner;

public class pesquisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do produto para verificarmos se o valor esta acima ou abaixo do preço");
        double vl = sc.nextDouble();
        if (vl <= 10) {

            System.out.println("O valor esta muito abaixo do mercado, pode comprar");

        } else if (vl >= 15 && vl <= 23) {

            System.out.println(
                    "fazer uma pesquisa de preços, de acordo com nossa tabela de preço esta um pouco acima da média");

        } else {
            System.out.println(
                    "Volte quando os preços estiverem abaixo do valor de mercado ou estiver na media para a compra");

        }

    }

}
