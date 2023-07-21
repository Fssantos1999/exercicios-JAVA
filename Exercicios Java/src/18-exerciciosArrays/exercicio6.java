import java.util.Scanner;

public class exercicio6 {
    
public static void main(String[] args) {
    

Scanner sc = new Scanner(System.in); 
int [] vetorA = new int[5]; 
int [] vetorB = new int [vetorA.length]; 

System.out.println("Vetor A : ");

for (int i = 0; i < vetorA.length; i++){

    vetorA[i] = sc.nextInt();
    vetorB[i] = vetorA[i] + vetorA[i]; 

}
System.out.println("Vetor B : ");
for (int i = 0; i< vetorB.length; i++){

    System.out.println(vetorB[i]);

}
System.out.println();




}







}
