import java.util.Scanner;

public class SquareCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the side of the square: ");
        double side = scanner.nextDouble();

        // Calculating perimeter and area
        double perimeter = 4 * side;
        double area = side * side;

        // Displaying results
        System.out.printf("Perimeter of the square: %.2f%n", perimeter);
        System.out.printf("Area of the square: %.2f%n", area);

        scanner.close();
    }
}
