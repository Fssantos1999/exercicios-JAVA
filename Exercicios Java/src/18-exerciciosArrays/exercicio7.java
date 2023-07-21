
import java.util.Scanner;

public class exercicio7 {
        
    public static void main(String[] args) {
            
    Scanner sc = new Scanner(System.in); 
    int [] vetorA = new int[5]; 
    int [] vetorB = new int [vetorA.length];     
    int [] vetorC = new int [vetorA.length]; 
    System.out.println("Vetor A : ");
    
    for (int i = 0; i<vetorA.length; i++){
        vetorA[i] = sc.nextInt(); 

    }System.out.println("VETOR B  : ");
    
    for (int i = 0; i<vetorB.length; i++){
        vetorB[i] = sc.nextInt(); 
        
    }
    System.out.println("Vetor C :    ");
    
    for (int i = 0; i<vetorC.length; i++){
        vetorC [i] = vetorB[i] - vetorA[i]; 
        System.out.println(vetorC[i]);

    }












    }
    }
