import java.util.Scanner;

public class bimestre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua primeira nota");
        int nota = sc.nextInt();
        System.out.println("Insira sua segunda nota");
        int nota2 = sc.nextInt();
        System.out.println("Insira sua terceira nota");
        int nota3 = sc.nextInt();
        System.out.println("Insira sua quarta nota");
        int nota4 = sc.nextInt();
        int result = nota + nota2 + nota3 + nota4;
        int resut1 = result / 4;
        if (result < 6) {
            System.out.println("Você passou e sua média foi " + (resut1));
        } else {
            System.out.println("Você não passou e sua média foi " + (resut1));

        }

    }

}
