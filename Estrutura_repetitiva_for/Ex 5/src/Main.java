import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println("O numero fatorial de " + n +" e:" + fat);
		
		sc.close();
	}
}
