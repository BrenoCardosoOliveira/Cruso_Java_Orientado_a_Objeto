import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.entidades.Client;
import model.entidades.Order;
import model.entidades.OrderItem;
import model.entidades.Product;
import model.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateStr = sc.nextLine();
        Date birthDate = sdf.parse(birthDateStr);
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        Order order = new Order(new Date(), status, client);
        
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine(); 
            String productName = sc.nextLine();
           
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            
            Product product = new Product(productName, productPrice);
            
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }
        
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);  


        sc.close();
    }   
}
