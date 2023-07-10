import java.util.Scanner;

public class troca {

    public static void main(String[] args) {
        System.out.println("SELECIONE UM DIA DA SEMANA :D");
        Scanner sc = new Scanner(System.in);

        int diasemana = sc.nextInt();

        switch (diasemana) {

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:

            case 7:
                System.out.println("É um dia útil");
                break;
            case 8:
                System.out.println(" É domingo e não é um dia util");
                break;
            default:
                System.out.println("Não é valido ! ");

        }

    }

}