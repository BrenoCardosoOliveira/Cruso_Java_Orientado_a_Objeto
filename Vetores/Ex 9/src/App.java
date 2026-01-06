import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        int n, maiorIdade, maiorPosicao = 0;

        System.out.print("Quantas pessoas voce vai digitar? ");
	    n = sc.nextInt();


        String[] nomes = new String[n];
        int[] idades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine(); 
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        maiorIdade = idades[0];
        for (int i = 1; i < n; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                maiorPosicao = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nomes[maiorPosicao] + " IDADE: " + maiorIdade);

        sc.close();
    }
}
