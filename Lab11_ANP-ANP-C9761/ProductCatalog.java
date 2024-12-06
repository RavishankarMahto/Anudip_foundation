import java.util.Scanner;

public class ProductCatalog {
    public static void main(String[] args) {
        // Define the product catalog
        String[] products = {"Laptop", "Mouse", "Keyboard", "Monitor", "Printer"};

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to search for a product
        System.out.print("Enter the product name to search: ");
        String searchProduct = scanner.nextLine();

        // Initialize a flag to indicate if the product is found
        boolean isFound = false;

        // Search for the product in the catalog
        for (String product : products) {
            if (product.equalsIgnoreCase(searchProduct)) { // Case-insensitive comparison
                isFound = true;
                break;
            }
        }

        // Display the result
        if (isFound) {
            System.out.println("Product " + searchProduct + " is available.");
        } else {
            System.out.println("Product " + searchProduct + " is not available.");
        }

        // Close the scanner
        scanner.close();
    }
}


// Output:

// Enter the product name to search: Mouse
// Product Mouse is available.

// Enter the product name to search: Tablet
// Product Tablet is not available.

