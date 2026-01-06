import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o numero de linhas :");
        int m = scanner.nextInt();
        System.out.println("Insira o numero de colunas :");
        int n = scanner.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Insira os elementos da matriz :");
        for (int i = 0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Insira um numero para busca :");
        int x = scanner.nextInt();
        for (int i = 0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){                
                 if (mat[i][j] == x){
                    System.out.println("Numero " + x + " encontrado!");
                    System.out.println("Posicao " + i + "," + j + ":");
                    if (j > 0){
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (j < mat[i].length - 1){
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i > 0){
                        System.out.println("Acima: " + mat[i-1][j]);
                    }
                    if (i < mat.length - 1){
                        System.out.println("Abaixo: " + mat[i+1][j]);
                    }
               
                }
      
            }
        

        scanner.close();

        }
    }
}




       
    



