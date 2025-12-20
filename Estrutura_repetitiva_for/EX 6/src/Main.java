import java.util.Scanner;
public class Main {	

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
		int n = sc.nextInt();
		System.out.println("O numero " + n + " pode ser dividido por: ");
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {

				System.out.println(i);
			}
		}
		
		sc.close();
	}
}