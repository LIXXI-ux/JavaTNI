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

        System.out.println("1. Pens");
        System.out.println("2. Notebooks");

        int choice;
        while (true) {
            System.out.print("Select product number: ");
            choice = sc.nextInt();
            if (choice == 1 || choice == 2) break;
        }

        Product selected = products[choice - 1];

        selected.showInfo();

        System.out.print("Enter quantity to buy: ");
        int amount = sc.nextInt();
        selected.sell(amount);

        selected.showInfo();
    }
}
