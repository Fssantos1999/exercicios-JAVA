import java.util.Scanner;

public class covert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("INSIRA A  TEMPERATURA EM FARENHEIT PARA CONVERSÃO EM CELSIUS");
        int F = sc.nextInt();

        int C = (5 * (F - 32) / 9);

        System.out.println("a conversão de celsuis é " + (C));

    }

}
