import java.util.Scanner;

public class quad {

    public static void main(String[] args) {
        System.out.println("Insira area de um quadrado para mostrarmos a area e dobra la ");
        Scanner sc = new Scanner(System.in);
        int quad = sc.nextInt();
        int result = quad * quad;
        System.out.println("A area deste quadrado é de " + (result) + " e o dobro desta area é " + (result + result));

    }

}
