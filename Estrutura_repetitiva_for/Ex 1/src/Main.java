import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor entre 1 e 1000:");
		int x = sc.nextInt();
		System.out.println("Números ímpares entre 1 e " + x + " são:");
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
    
}
