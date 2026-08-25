import java.util.Scanner;

public class Activity4_Switch_PACIS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1-4): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Option 1: View Grades");
                System.out.println("----- Your Grades -----");
                System.out.println("Java Programming: 98");
                System.out.println("Database Management: 95");
                System.out.println("Computer Networking: 97");
                System.out.println("Web Development: 96");
                System.out.println("Information Management: 94");
                break;

            case 2:
                System.out.println("You selected Option 2: Enroll Subjects");
                System.out.println("----- Available IT Subjects -----");
                System.out.println("1. Object-Oriented Programming");
                System.out.println("2. Data Structures and Algorithms");
                System.out.println("3. Software Engineering");
                System.out.println("4. Computer Security");
                System.out.println("5. Mobile Application Development");
                System.out.println("6. Artificial Intelligence");
                break;

            case 3:
                System.out.println("You selected Option 3: Pay Tuition");
                System.out.println("----- Tuition Balance -----");
                System.out.println("Total Tuition Fee: PHP 25,500.00");
                System.out.println("Amount Paid: PHP 15,000.00");
                System.out.println("Remaining Balance: PHP 10,500.00");
                break;

            case 4:
                System.out.println("You selected Option 4: Exit");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }

        input.close();
    }
}