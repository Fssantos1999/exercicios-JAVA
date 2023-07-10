import java.util.Scanner;

public class infdia {

public static void main(String[] args) {

Scanner sc = new Scanner (System.in);

System.out.println("Digite um número de 1 a 6 para informa-lo o dia "); 

int dia = sc.nextInt(); 



switch (dia)

{
    
    case 1: 
        System.out.println("Sera  domingo");
        break;

    case 2: 
        System.out.println("Sera  segunda feira");
        break;
    case 3: 
        System.out.println("Sera  terça feira");
        break; 
    case 4: 
        System.out.println("Sera  quarta feira");
        break;
    case 5:
        System.out.println("Sera  quinta feira");
        break;

    case 6: 
        System.out.println("Sera  sexta feira");
        break; 


    default: 
    System.out.println("Esse não é um numero válido por favor insira um numero de 1 a 6");
    break;
}




}




































}