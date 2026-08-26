import java.util.Scanner; // 1. FIXED: Added missing import

public class NestedIfStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Age Categorizer ---");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid Input: Age cannot be negative.");
        } else if (age <= 2) {
            System.out.println("Category: Baby");
        } else if (age <= 12) {
            System.out.println("Category: Child");
        } else if (age <= 19) {
            System.out.println("Category: Teenager");
        } else {
            System.out.println("Category: Adult / Out of range specified");
        }

        sc.close();
    }
}
