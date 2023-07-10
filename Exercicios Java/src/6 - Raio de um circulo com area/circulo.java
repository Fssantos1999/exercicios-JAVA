import java.util.Scanner;

public class circulo {

    public static void main(String[] args) {
        System.out.println("insira a area do circulo que deseja calcular ");
        Scanner sc = new Scanner(System.in);
        int circ = sc.nextInt();
        double result = 3.14 * circ * circ; // para calcular a area de um circulo é PI * RAIO AO QUADRADO
        System.out.println("a area do circulo é de " + (result));

    }

}