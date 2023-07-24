import java.util.Random;

public class exer1 {

    public static void main(String[] args) {
        
        int[][] valores = new int[4][4];
        Random numeroRandom = new Random(); 

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = numeroRandom.nextInt(100);
            }
        }

        int maior = 0;
        int linha = 0;
        int col = 0;

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                if (valores[i][j] > maior) {
                    maior = valores[i][j];
                    linha = i;
                    col = j;
                }
            }
        }

        System.out.println("A matriz 4x4:");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("O maior valor na matriz é: " + maior);
        System.out.println("Ele está na linha " + linha + " e coluna " + col);
    }
}
    