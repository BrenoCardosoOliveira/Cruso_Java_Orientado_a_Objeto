package application;

import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
         
        int n;

        System.out.print("Quantas pessoas serao inseridas? ");
	    n = sc.nextInt();

        pessoas.Pessoas[] pessoas = new pessoas.Pessoas[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            Integer idade = sc.nextInt();
            System.out.print("Altura: ");
            Double altura = sc.nextDouble();
            pessoas[i] = new pessoas.Pessoas(nome, idade, altura);
        }
        for (int i = 0; i < n; i++) {
            if (pessoas[i].getIdade() < 16) {
                pessoas[0].setMenor(pessoas[0].getMenor() + 1);
            }
            pessoas[0].setAlturatotal(pessoas[0].getAlturatotal() + pessoas[i].getAltura());
        }
        pessoas[0].setAlturamedia(pessoas[0].getAlturatotal() / n);
        pessoas[0].setPercentualmenor(((pessoas[0].getMenor() * 100.0) / n));
        System.out.printf("Altura media: %.2f%n", pessoas[0].getAlturamedia());
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", pessoas[0].getPercentualmenor());

        for (int i = 0; i < n; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
    }

}
