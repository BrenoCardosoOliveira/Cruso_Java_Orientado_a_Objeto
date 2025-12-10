import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("DIGITE UM NÚMERO: ");
        Scanner sc = new Scanner(System.in);
       
		int N = sc.nextInt();
	    
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();
        

    }
    
}
