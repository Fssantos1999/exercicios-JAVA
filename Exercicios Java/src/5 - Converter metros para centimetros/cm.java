import java.util.Scanner;

public class cm {

    public static void main(String[] args) {
        System.out.println("Digite o números de metros que deseja converter para cm ! ");
        Scanner sc = new Scanner(System.in);

        int cent = sc.nextInt();

        int convert = cent * 100;

        System.out.println("O comprimento escolhido para metros foi " + (cent));
        System.out.println("E a conversão para cm é " + (convert) + "cm");

    }

}
