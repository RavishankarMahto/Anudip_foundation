import java.util.Scanner;

public class EmployeeAllowanceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basic salary of the employee: ");
        double salary = scanner.nextDouble();


        double da = salary * 0.12;    // DA is 12% of salary
        double hra = salary * 0.13;   // HRA is 13% of salary
        double pf = salary * 0.15;    // PF is 15% of salary


        double gross = salary + da + hra - pf;


        System.out.printf("Employee Allowances and Gross Salary:%n");
        System.out.printf("Basic Salary: %.2f%n", salary);
        System.out.printf("DA (12%%): %.2f%n", da);
        System.out.printf("HRA (13%%): %.2f%n", hra);
        System.out.printf("PF (15%%): %.2f%n", pf);
        System.out.printf("Gross Salary: %.2f%n", gross);

        scanner.close();
    }
}
