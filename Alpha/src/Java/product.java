
package Java;
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Product> cart = new ArrayList<>();

        // Add some sample products to the list
        products.add(new Product("Laptop", 800.0));
        products.add(new Product("Headphones", 50.0));
        products.add(new Product("Smartphone", 500.0));
        products.add(new Product("Keyboard", 30.0));

        System.out.println("Welcome to Online Shopping!");

        while (true) {
            System.out.println("\nAvailable Products:");
            displayProducts(products);

            System.out.println("\nEnter the product number to add it to your cart (or enter 0 to checkout):");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for shopping with us! Your total price is: $" + calculateTotal(cart));
                break;
            } else if (choice > 0 && choice <= products.size()) {
                Product selectedProduct = products.get(choice - 1);
                cart.add(selectedProduct);
                System.out.println(selectedProduct.name + " added to your cart.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static void displayProducts(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + ". " + product.name + " - $" + product.price);
        }
    }

    public static double calculateTotal(ArrayList<Product> cart) {
        double total = 0.0;
        for (Product product : cart) {
            total += product.price;
        }
        return total;
    }
}
