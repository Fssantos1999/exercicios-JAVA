import java.util.Scanner;

public class exercicio19 {
   public static void main(String[] args) {
    
    
int [] idade = new int [5]; 
Scanner sc = new Scanner(System.in);


for (int i = 0; i<idade.length; i++){
    System.out.println("Entre com a idade das pessoas");
    idade[i]= sc.nextInt(); 
}
int menor = idade[0];
int indexmenor = 0;
int maior = idade[1];
int indexmaior = 0;
 for (int i = 1; i<idade.length; i++){
    if(idade[i]>maior){
        maior=idade[i];
        indexmaior=i;
    }else if (idade[i]<menor){
        menor = idade[i];
        indexmenor =i;
    }

System.out.println("Vetores de idade : ");
  for (int id = 0; id<idade.length; id++) {
    System.out.println( " ");

  } 
System.out.println(); 
System.out.println("Menor idade " + menor);
System.out.println("indice menor idade " + indexmenor);
System.out.println("Maior idade " + maior);
System.out.println("indice maior idade " + indexmaior);


}





   } 
}
