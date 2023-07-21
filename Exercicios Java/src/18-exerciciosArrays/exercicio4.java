import java.util.Scanner;
import java.lang.Math;
public class exercicio4 {
    public static void main(String[] args) {
         
        double [] vetorA = new double[5];
        double [] vetorB = new double[vetorA.length]; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vetor A: ");

        for (int i = 0; i<vetorA.length;i++){
          
            vetorA[i] = sc.nextDouble(); 
            vetorB[i] = Math.pow(vetorA[i], 2);
        }

        System.out.println("Vetor B : ");
        for (int i = 0; i<vetorB.length;i++){
        System.out.println(vetorB[i] + " ");

        }

        System.out.println();








    }


}
