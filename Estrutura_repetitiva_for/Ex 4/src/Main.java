import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de testes:");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
            
			System.out.println("digite o primeiro numero:");
			int x = sc.nextInt();

            System.out.println("digite o segundo numero:");
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
	}
    }
    

