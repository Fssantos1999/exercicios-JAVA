
import java.util.Scanner;



public class idadeMeF {
public static void main(String[] args) {
    
int [] vetorA = new int [5]; 
Scanner sc = new Scanner(System.in);


for (int i = 0; i<vetorA.length; i++){
    System.out.println("Entre com a idade das pessoas");
    vetorA[i]= sc.nextInt(); 
}
    int qntd= 0; 
for (int i = 0 ; i<vetorA.length; i++){
    if (vetorA[i] >= 35 ){
        qntd++;
    }
System.out.println(qntd);


   }












}


}