import java.util.Scanner;

class BankAccount {
  
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private double balance;

    
    public BankAccount() {
        this.accountHolderName = "Default User";
        this.accountNumber = "00000001";
        this.accountType = "Savings";
        this.balance = 1000.0;
    }

   
    public BankAccount(String accountHolderName, String accountNumber, String accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Welcome to Bank Account Management System");
        System.out.println("1. Create Default Account");
        System.out.println("2. Create Custom Account");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        BankAccount account;

        if (choice == 1) {
            
            account = new BankAccount();
        } else if (choice == 2) {
           
            System.out.print("Enter Account Holder Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Account Number: ");
            String accountNumber = scanner.nextLine();

            System.out.print("Enter Account Type (e.g., Savings, Current): ");
            String accountType = scanner.nextLine();

            System.out.print("Enter Initial Balance: ₹");
            double balance = scanner.nextDouble();

            account = new BankAccount(name, accountNumber, accountType, balance);
        } else {
            System.out.println("Invalid choice!");
            return;
        }

      
        account.displayAccountDetails();


        scanner.close();
    }
}
