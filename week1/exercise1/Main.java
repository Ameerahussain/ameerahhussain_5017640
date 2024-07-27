package week1.exercise1;
import java.util.HashMap;
import java.util.Scanner;

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters for each attribute
    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Quantity: " + quantity + ", Price: " + price;
    }
}

class InventorySystem {
    private HashMap<String, Product> inventory;

    public InventorySystem() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, String productName, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    public void listProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. List Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    Product product = new Product(productId, productName, quantity, price);
                    inventorySystem.addProduct(product);
                    break;

                case 2:
                    System.out.print("Enter Product ID to update: ");
                    productId = scanner.nextLine();
                    System.out.print("Enter new Product Name: ");
                    productName = scanner.nextLine();
                    System.out.print("Enter new Quantity: ");
                    quantity = scanner.nextInt();
                    System.out.print("Enter new Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    inventorySystem.updateProduct(productId, productName, quantity, price);
                    break;

                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    productId = scanner.nextLine();
                    inventorySystem.deleteProduct(productId);
                    break;

                case 4:
                    inventorySystem.listProducts();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
