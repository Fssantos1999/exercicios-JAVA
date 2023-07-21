import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[6];
        int[] vetorB = new int[6];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Enter the value for position " + i);
            vetorA[i] = sc.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i] + " ");
        }
    }
}