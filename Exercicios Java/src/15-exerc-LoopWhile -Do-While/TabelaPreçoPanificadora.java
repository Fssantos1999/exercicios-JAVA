public class TabelaPreçoPanificadora {


public static void main(String[] args) {

double preço = 0.10; 
int  cont = 0; 

while (cont <= 50 && preço < 9  ){
    preço += 0.10;
    cont++;
    String Qntd = String.format("%.2f", preço);
    
    System.out.println("Quantidade de pães " + cont + " Preço Pães " + Qntd);


}










}




    
}
