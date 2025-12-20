import java.util.Scanner;

public class Main {
		public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantidade de repeticao:");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		System.out.println("Digite " + n + " números:");
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		System.out.println("quantidadede de numero fora do intervalo:");
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
}
}
