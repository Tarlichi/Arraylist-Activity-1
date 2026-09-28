import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Enter Console Sales Data ---");

        System.out.print("Enter console device type (e.g., PS5, XBOX, SWITCH): ");
        String consoleType = scanner.nextLine();

        System.out.print("Enter store name: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = scanner.nextInt();

        // Create the object using the user's input
        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);

        System.out.println("\n"); 
        
        // Call the printReport method
        sale.printReport();

        scanner.close();
    }
}