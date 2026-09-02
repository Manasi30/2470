import java.util.Scanner;

public class REPL {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 0;
        int choice;

        do {
            System.out.println();
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Select an option: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.println("Current balance: $" + balance);

            } else if (choice == 2) {

                System.out.print("Enter deposit amount: $");
                double deposit = input.nextDouble();

                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("Deposit successful.");
                } else {
                    System.out.println("You cannot deposit a negative value.");
                }

            } else if (choice == 3) {

                System.out.print("Enter withdrawal amount: $");
                double withdrawal = input.nextDouble();

                if (withdrawal <= 0) {
                    System.out.println("You cannot withdraw a negative value.");
                } else if (withdrawal > balance) {
                    System.out.println("Insufficient funds.");
                } else {
                    balance = balance - withdrawal;
                    System.out.println("Withdrawal successful.");
                }

            } else if (choice == 4) {

                System.out.println("Goodbye!");

            } else {

                System.out.println("Please select an option from 1-4.");

            }
        } while (choice != 4);

        input.close();
    }
}