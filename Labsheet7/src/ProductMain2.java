import java.util.Scanner;

public class ProductMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[2];

        products[0] = new Product();
        products[0].name = "Pens";
        products[0].price = 10.5;
        products[0].quantity = 50;

        products[1] = new Product();
        products[1].name = "Notebooks";
        products[1].price = 25.75;
        products[1].quantity = 20;

        System.out.println("=== Mini Shop ===");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i].name);
        }

        int choice;
        while (true) {
            System.out.print("Choose product: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 2) break;
            System.out.println("Invalid choice, try again.");
        }

        Product selected = products[choice - 1];
        selected.showInfo();

        System.out.print("Quantity to buy: ");
        selected.sell(sc.nextInt());

        System.out.println("\nUpdated product info:");
        selected.showInfo();
    }
}
