
import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    double [] vetorA = new double[5]; 
    double [] vetorB = new double[vetorA.length];
    double [] vetorC = new double [vetorA.length]; 
    System.out.println("Insira  O número que sera dividido ");
    for(int i= 0; i<vetorA.length; i++){
        vetorA[i] = sc.nextDouble();
       
    }
    System.out.println("Insira o divisor do Vetor B :  ");

    for (int i = 0 ; i<vetorB.length; i++){
        vetorB [i] = sc.nextDouble();

    }
    for (int i = 0 ; i<vetorC.length; i++){
         vetorC [i] = vetorA[i] / vetorB[i]; 
        System.out.println("RESTO DAS DIVISOES : " + vetorC[i]);

    }








}

}
