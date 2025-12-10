import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite a senha de 4 digitos:");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida!\n");
            
			System.out.println("Digite a senha novamente:");
            senha = sc.nextInt();
            
		}
		
		System.out.println("Acesso Permitido!");
		
		sc.close();
    }
    
}
