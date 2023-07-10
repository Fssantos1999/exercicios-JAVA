    import java.util.Scanner;

    public class aprovado {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Olá Aluno,porfavor insira a primeira nota que você tirou");

            int nota = sc.nextInt();
            System.out.println("Porfavor insira agora a sua segunda nota para realizarmos o calculo da sua nota");
            int nota2 = sc.nextInt();

            int resultado= (nota+nota2) / 2;
            

            System.out.println(resultado);
            


            if (resultado >= 9  && resultado <=10) {
                System.out.println("Parabéns, você tirou nota A! Isso significa que você tirou a nota " + resultado + "Vai descansar você merece");
            }
            else if (resultado >= 7 && resultado <= 8){

                System.out.println("Parabéns, você tirou a nota B ! isso significa que você tirou a nota " + (resultado) + " Parabéns continue assim,estudando :)"); 
                
            }
            else if (resultado >= 5 && resultado >=6){
 
                System.out.println("Você tirou a nota C  " + (resultado) + " ufa quase você ficou de recuperação em ! "); 
            }

            else if (resultado <=5){
                System.out.println("Você ficou de recuperação por tirar a nota C,fale com o seu professor que esta devendo nota, ele te passara alguns trabalhos para repor nota ! ");


            }


            



            }
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        }





















