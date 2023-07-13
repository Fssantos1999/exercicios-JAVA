import java.util.Scanner;

public class LojaTabajara{

public static void main(String[] args) {

Scanner sc = new Scanner(System.in); 
boolean resposta =false;
double preço; 
double totalCompra = 0 ; 
double pagarDinheiro;
int qntd; 
String output = "";


System.out.println("Bem vindo a loja tabajara");


do {
    System.out.println("Deseja informar uma nova compra S/N ?");
    String continuarcompra = sc.next();
    
    if(continuarcompra.equalsIgnoreCase("s")){
        System.out.println("Informe a quantidade de produtos");
        qntd = sc.nextInt();
        for (int i = 0 ; i < qntd; i++){
            System.out.println("Informe preço dos itens ");
            preço = sc.nextDouble();
            totalCompra += preço;
            output += "Produto " + i + ": R$ " + preço + "\n"; 

        }
      
        System.out.println( "Total : R$ "+ totalCompra);
        System.out.println("Informe o valor em dinheiro");
        pagarDinheiro= sc.nextDouble();

    if  (pagarDinheiro<totalCompra){
                       
        System.out.println("Valor inválido");  
    }
    else{
        System.out.println("Compra Conluída. Troco de:  " + (pagarDinheiro-totalCompra));
    }
       
    }else {
        resposta = true; 


    }

}while(!resposta);


















}





















}