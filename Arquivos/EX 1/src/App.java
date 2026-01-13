
import entities.Produto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> prod = new ArrayList<>();

        System.out.println("insira o caminho do arquivo: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolder = sourceFile.getParent();

        boolean success = new File(sourceFolder + "/SaidadeEstoque").mkdir();
        String targetFileStr = sourceFolder + "/SaidadeEstoque/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();

            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                prod.add(new Produto(nome, preco, quantidade));

                itemCsv = br.readLine();
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
            for (Produto item : prod) {
                bw.write(item.getNome() + "," + String.format("%.2f", item.valorTotalEmEstoque()));
                bw.newLine();
            }

            System.out.println(targetFileStr + " criado com sucesso " );
            
        } catch (IOException e) {
            System.out.println("Error ao garava o arquivo: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error ao ler o arquivo: " + e.getMessage());
        }



        sc.close();
    }
}
