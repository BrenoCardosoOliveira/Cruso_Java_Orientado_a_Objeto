import java.util.Locale;
import java.util.Scanner;

public class App {
      	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posimaior;
	    double maior;

	    System.out.print("Quantos numeros voce vai digitar? ");
	    n = sc.nextInt();

	    double[] vetor = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextDouble();
	    }

	    maior = vetor[0];
	    posimaior = 0;

	    for (int i=1; i<n; i++) {
	        if (vetor[i] > maior) {
	            maior = vetor[i];
			// +1 para ajustar a posicao pois o vetor comeca em 0
	            posimaior = i+1;
	        }
	    }
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posimaior);

		sc.close();
	}
}

