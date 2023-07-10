import java.util.Scanner;

public class soma {

    public static void main(String[] args) {
        System.out.println("insira um numero para a soma");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("insira outro numero para a soma");
        int b = sc.nextInt();
        int resul = i + b;
        System.out.println("o resultado foi " + (resul));

    }

}
