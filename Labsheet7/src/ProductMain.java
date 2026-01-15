import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        inputProduct(product, sc);
        System.out.println("\n--- BEFORE UPDATE ---");
        product.showInfo();

        System.out.print("\nAdd stock? (yes/no): ");
        if (sc.next().equalsIgnoreCase("yes")) {
            System.out.print("Amount to add: ");
            product.addStock(sc.nextInt());
        }

        System.out.print("\nChange price? (yes/no): ");
        if (sc.next().equalsIgnoreCase("yes")) {
            System.out.print("New price: ");
            product.changePrice(sc.nextDouble());
        }

        System.out.println("\n--- AFTER UPDATE ---");
        product.showInfo();
    }

    private static void inputProduct(Product p, Scanner sc) {
        System.out.print("Product name: ");
        p.name = sc.nextLine();

        System.out.print("Price: ");
        p.price = sc.nextDouble();

        System.out.print("Quantity: ");
        p.quantity = sc.nextInt();
    }
}
