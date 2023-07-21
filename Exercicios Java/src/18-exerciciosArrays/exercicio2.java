import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores do vetor A:");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("Vetor B:");

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println(); // Pula uma linha após imprimir o vetor B
    }
}