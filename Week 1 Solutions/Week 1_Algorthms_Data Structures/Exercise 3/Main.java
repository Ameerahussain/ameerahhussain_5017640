import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("003", "Alice", 250.75),
                new Order("001", "Bob", 150.00),
                new Order("002", "Charlie", 300.50)
        };


        SortUtil.bubbleSort(orders);
        System.out.println("Bubble Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }


        orders = new Order[]{
                new Order("003", "Alice", 250.75),
                new Order("001", "Bob", 150.00),
                new Order("002", "Charlie", 300.50)
        };


        SortUtil.quickSort(orders, 0, orders.length - 1);
        System.out.println("Quick Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
