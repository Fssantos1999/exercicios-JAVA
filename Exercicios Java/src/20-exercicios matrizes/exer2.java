import java.util.Random;

public class exer2 {
    public static void main(String[] args) {
        
        int[][] numerosAleatorios = new int[10][10];

        Random numeroRandom = new Random();
        //percorrendo linhas e colunas e adicionando números aleatórios
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
         
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
                System.out.printf("%4d ", numerosAleatorios[i][j]); 
         } System.out.println();
        }
        
        int maior = Integer.MIN_VALUE; 
        int coluna = 5;
        //percorrendo somente a linha para achar o valor maior em algumas das colunas
        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i][coluna] > maior) {
                maior = numerosAleatorios[i][coluna];
                
            }
        }
        for (int i = 0; i< numerosAleatorios.length; i++){
            for (int j = 0; j < numerosAleatorios.length; j++){     

            }
        }
        System.out.println();
        
        //saída do loop com o número maior encontrado na coluna 5  
        System.out.println("Maior valor na coluna " + coluna + ": " + maior);
    
    }

}
