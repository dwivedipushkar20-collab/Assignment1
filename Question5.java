package Assingment1;
import java.util.Scanner;

class BankAccount {

    private String accountNumber;
    private String name;
    private double balance;

    BankAccount(String accountNumber, String name, double balance) {

        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) throws Exception {

        if (amount <= 0) {
            throw new Exception("Deposit amount must be greater than zero.");
        }

        balance = balance + amount;

        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) throws Exception {

        if (amount <= 0) {
            throw new Exception("Withdrawal amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new Exception("Insufficient balance.");
        }

        balance = balance - amount;

        System.out.println("Amount withdrawn successfully.");
    }

    void checkBalance() {

        System.out.println("Current Balance: ₹" + balance);
    }

    void displayDetails() {

        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: ₹" + balance);
    }
}

public class Question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = null;

        int choice;

        do {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance Enquiry");
            System.out.println("5. Account Details");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            try {

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:

                        if (account != null) {
                            System.out.println("Account already exists.");
                            break;
                        }

                        System.out.print("Enter Account Number: ");
                        String accountNumber = sc.nextLine();

                        System.out.print("Enter Account Holder Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Initial Balance: ");
                        double balance = sc.nextDouble();

                        if (balance < 0) {
                            throw new Exception(
                                    "Initial balance cannot be negative."
                            );
                        }

                        account = new BankAccount(
                                accountNumber,
                                name,
                                balance
                        );

                        System.out.println(
                                "Account created successfully."
                        );

                        break;


                    case 2:

                        if (account == null) {
                            System.out.println("Please create an account first.");
                            break;
                        }

                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();

                        account.deposit(depositAmount);

                        break;


                    case 3:

                        if (account == null) {
                            System.out.println("Please create an account first.");
                            break;
                        }

                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();

                        account.withdraw(withdrawAmount);

                        break;


                    case 4:

                        if (account == null) {
                            System.out.println("Please create an account first.");
                            break;
                        }

                        account.checkBalance();

                        break;


                    case 5:

                        if (account == null) {
                            System.out.println("Please create an account first.");
                            break;
                        }

                        account.displayDetails();

                        break;


                    case 6:

                        System.out.println("Thank you for using Bank Management System.");

                        break;


                    default:

                        System.out.println("Invalid choice.");
                }

            } catch (Exception e) {

                System.out.println("Error: " + e.getMessage());

                sc.nextLine();
                choice = 0;
            }

        } while (choice != 6);

        sc.close();
    }
}