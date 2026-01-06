
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<cadastro.Funcionario> lista = new ArrayList<>();

        //Inserir dados
        System.out.print("Quantos funcionarios serao cadastrados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionario #" + i + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(lista, id)) {
				System.out.print("Id ja existe. Por favor, digite novamente: ");
				id = sc.nextInt();
			} 
            
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            cadastro.Funcionario func = new cadastro.Funcionario(id, nome, salario);
            lista.add(func);
        }
        // incrementar salário

        System.out.println();
        System.out.print("Digite o ID do funcionario que tera aumento salarial: ");
        int id = sc.nextInt();
        cadastro.Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (func == null) {
            System.out.println("Esse ID não existe!");
        } else {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = sc.nextDouble();
            func.incrementarSalario(porcentagem);
        }

        // Listar funcionários
        System.out.println();
        System.out.println("Lista de funcionarios:");
        for (cadastro.Funcionario f : lista) {
            System.out.println(f);
        }

        
        sc.close();
        

    }

    public static boolean hasId(List<cadastro.Funcionario> list, int id) {
		cadastro.Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
}
}