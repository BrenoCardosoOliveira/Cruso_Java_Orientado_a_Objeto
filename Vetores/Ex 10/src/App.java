
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

         System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();

        alunos.Notas[] nota = new alunos.Notas[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); 
            System.out.printf("Digite os dados do aluno:" + (i + 1));
            System.out.println();
             System.out.print("Nome: ");
            String name = sc.nextLine();
             System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
             System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            nota[i] = new alunos.Notas(name, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {
          
            if (nota[i].getMedia() >= 6.0) {
                System.out.println(nota[i].getName() + " - Media das notas" + String.format("%.2f", nota[i].getMedia()) );
            }
        }

        sc.close();
       
    }
}
