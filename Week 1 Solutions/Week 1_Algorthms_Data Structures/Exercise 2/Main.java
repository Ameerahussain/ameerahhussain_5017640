import java.util.Arrays;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

public class Main {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void sortProducts(Product[] products) {
        Arrays.sort(products, (a, b) -> Integer.compare(a.productId, b.productId));
    }

    public static void main(String[] args) {
        // Create an array of products
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(205, "Smartphone", "Electronics"),
                new Product(320, "Desk Chair", "Furniture"),
                new Product(410, "Bluetooth Speaker", "Electronics"),
                new Product(520, "Coffee Maker", "Appliances")
        };

        // Sort products by productId for binary search
        Product[] sortedProducts = products.clone();
        sortProducts(sortedProducts);

        // Define the target productId to search for
        int targetId = 320;

        // Perform linear search
        Product resultLinear = linearSearch(products, targetId);
        System.out.println("Linear Search Result: " + resultLinear);

        // Perform binary search
        Product resultBinary = binarySearch(sortedProducts, targetId);
        System.out.println("Binary Search Result: " + resultBinary);
    }
}
