import java.util.Scanner;

public class ProductMain4 {

    public static void setting_product(Product[] products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[4];
        setting_product(products);

        showMenu(products);

        int choice;
        while (true) {
            System.out.print("Select product number: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= products.length) break;
            System.out.println("Invalid number.");
        }

        System.out.print("Buy quantity: ");
        int qty = sc.nextInt();

        products[choice - 1].sell(qty);
        products[choice - 1].showInfo();
    }

    private static void showMenu(Product[] products) {
        System.out.println("=== MINI SHOP ===");
        for (int i = 0; i < products.length; i++) {
            System.out.println(
                    (i + 1) + ". " + products[i].name +
                            " (" + products[i].quantity + " items)"
            );
        }
    }
}
