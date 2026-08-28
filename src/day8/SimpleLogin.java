import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctUsername = "Asa";
        String correctPassword = "babymonster";

        int attempts = 0;
        boolean loginSuccessful = false;

        while (attempts < 3) {

            System.out.print("Enter Username: ");
            String username = input.nextLine();

            System.out.print("Enter Password: ");
            String password = input.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("\nLogin Successful!");
                loginSuccessful = true;
                break;
            } else {
                attempts++;
                System.out.println("\nIncorrect username or password.");
                System.out.println("Attempts remaining: " + (3 - attempts));
                System.out.println();
            }
        }

        if (!loginSuccessful) {
            System.out.println("Too many failed attempts. Account locked.");
        }

        input.close();
    }
}