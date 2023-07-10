
import java.util.Scanner;

public class descontofgts{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // CÁLCULO DE HORAS TRABALHADAS E VALOR HORA DO FUNCIONÁRIO
        
        System.out.println("INSIRA QUANTAS HORAS VOCÊ TRABALHOU ESTE MêS");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println("INSIRA O QUANTO VOCÊ RECEBE POR HORA");
        double valorHora = sc.nextDouble();
        double salarioBruto = valorHora * horasTrabalhadas;
        double fgts = salarioBruto * 0.05;
        double descontos = salarioBruto * 0.20 - salarioBruto;
        
        
        if (salarioBruto <= 900){

            System.out.println("VOCÊ ESTA ISENTO DE QUALQUER TIPO DE IMPOSTO DO GOVERNO FEDERAL, SEU SÁLARIO É DE " + (salarioBruto));
            

        }
        else if (salarioBruto < 2000){
            System.out.println("O VALOR DO SEU SÁLARIO É DE  R$ " + (salarioBruto) + " E COM DESCONTO DE R$ " + (salarioBruto*0.05) + " O SEU SALARIO SERA DE REAIS  R$ " + (fgts-salarioBruto));
            


        }  

        if (salarioBruto >= 2500){

            System.out.println("HAVERA 20% DE DESCONTO DO SEU SÁLARIO QUE É DE  R$ " + (salarioBruto));
            System.out.println( "(-) IR (5%) " + (salarioBruto * 0.05)); 
            System.out.println("(-) FGTS (5%) " + (salarioBruto * 0.05 )); 
            System.out.println( "(-) INSS (10%) " + (salarioBruto * 0.10)); 
            System.out.println(" VALOR LÍQUIDO DO SEU SÁLARIO APÓS OS DESCONTOS APLICADOS É DE " + (descontos)); 
             







        }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    }
}