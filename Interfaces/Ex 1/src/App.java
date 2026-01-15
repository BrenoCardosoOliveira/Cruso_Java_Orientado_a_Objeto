import entities.Contract;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import service.ContractServise;
import service.PaypalService;

public class App {
    public static void main(String[] args) throws Exception {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

       System.out.println("Enter contract data:");
       System.out.print("Number:");
       int id = sc.nextInt();
       System.out.print("Date (dd/MM/yyyy):");
       LocalDate date = LocalDate.parse(sc.next(), fmt);
       System.out.print(" Contract Value:");
       double totalValue = sc.nextDouble();

         Contract obj = new Contract(id, totalValue, date);
            
         System.out.print("Enter number of installments:");
            int n = sc.nextInt();

            ContractServise contractServise = new ContractServise(new PaypalService());
            contractServise.processContract(obj, n);

            System.out.println("Installments:");
            for (entities.Installment installment : obj.getInstallments()) {
                System.out.println(installment);
            }

       sc.close();
    }
}
