import java.util.Scanner;

public class Activity5_PACIS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 5000.00;
        int choice;
        double depositAmount;
        double withdrawAmount;

        System.out.println("===== SIMPLE ATM MENU =====");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");
        System.out.print("Enter your choice (1-4): ");

        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Current Balance: PHP " + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: PHP ");
                depositAmount = input.nextDouble();

                if (depositAmount > 0) {
                    balance = balance + depositAmount;
                    System.out.println("Deposit successful!");
                    System.out.println("New Balance: PHP " + balance);
                } else {
                    System.out.println("Invalid deposit amount. Amount must be greater than zero.");
                }
                break;

            case 3:
                System.out.print("Enter withdrawal amount: PHP ");
                withdrawAmount = input.nextDouble();

                if (withdrawAmount > 0) {
                    if (withdrawAmount <= balance) {
                        balance = balance - withdrawAmount;
                        System.out.println("Withdrawal successful!");
                        System.out.println("New Balance: PHP " + balance);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                } else {
                    System.out.println("Invalid withdrawal amount. Amount must be greater than zero.");
                }
                break;

            case 4:
                System.out.println("Thank you for using the Simple ATM.");
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("Invalid choice. Please enter a number from 1 to 4.");
        }

        input.close();
    }
}