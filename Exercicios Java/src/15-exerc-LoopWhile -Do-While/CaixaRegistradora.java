import java.util.Scanner;

public class CaixaRegistradora {
    
    public static void main(String[] args) {
        System.out.println("Lojas tabajara");
        boolean sair = false;
        Scanner sc = new Scanner(System.in);
        int qtdprodutos;
        double preco; 
        double total; 
        String output;
        double valorpago;
        do {

            System.out.println("Deseja informar uma nova compra");
            String continuarCompra = sc.next();
            if (continuarCompra.equalsIgnoreCase("s")){

                output="Lojas tabajara\n"; 
                
                System.out.println("Digita a quantidade de produtos da compra");

                qtdprodutos=sc.nextInt(); 
                total = 0;
                for (int i=1; i<=qtdprodutos; i++){
                    System.out.println("informe preço dos produtos" +i);
                    preco= sc.nextDouble();
                   output="Produto" + i + ": R$" + preco + "\n";

                    
                }
                output +="Total: R$" + total;
                System.out.println("Total: R$" + total );
                valorpago=sc.nextDouble();



            }else{
                sair =true; 



            }
 








        }while(!sair);







    }
}
