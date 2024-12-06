import java.util.Scanner;

public class MarksAnalysis {
    public static void main(String[] args) {
        // Create an array to store marks of 12 students
        int[] marks = new int[12];
        Scanner scanner = new Scanner(System.in);

        // Input marks from the user
        System.out.println("Enter marks of 12 students:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

        // Initialize highest and lowest marks
        int highest = marks[0];
        int lowest = marks[0];

        // Find the highest and lowest marks
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
            if (mark < lowest) {
                lowest = mark;
            }
        }

        // Display the highest and lowest marks
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);

        // Close the scanner
        scanner.close();
    }
}


// Output:
// 56 78 89 45 92 67 88 91 73 81 60 77
