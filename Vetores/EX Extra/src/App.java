
import cadastro.hospedes;
import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        hospedes [] hosp = new hospedes[10];

        System.out.println("Digite quantos quartos serao alugados:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Hospede #" + (i + 1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            hosp[quarto] = new hospedes(nome, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (hosp[i] != null) {
                System.out.println(i + ": " + hosp[i]);
            }
        }

        sc.close(); 
    }
}
