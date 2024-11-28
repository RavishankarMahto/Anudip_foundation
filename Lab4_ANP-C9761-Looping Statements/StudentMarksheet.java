import java.util.Scanner;

public class StudentMarksheet {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();


        int[] marks = new int[3];
        int totalMarks = 0;

       
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

       
        double percentage = totalMarks / 3.0;

        
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "F"; // Fail grade
        }

        // Determine pass or fail
        boolean isPass = true;
        for (int mark : marks) {
            if (mark < 50) {
                isPass = false;
                break;
            }
        }
        String result = isPass ? "Pass" : "Fail";


        System.out.println("\n--- Student Marksheet ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);

       
        scanner.close();
    }
}
