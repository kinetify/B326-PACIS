import java.util.Scanner;

public class Activity4_If_PACIS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1-4): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("You selected Option 1: Start Game");
            System.out.println("----- Select Difficulty -----");
            System.out.println("Type: easy, medium, or hard");
            System.out.print("Enter difficulty: ");

            String difficulty = input.next();

            if (difficulty.equalsIgnoreCase("easy")) {
                System.out.println("You selected EASY mode.");
                System.out.println("Game starting... Good luck!");
            } else if (difficulty.equalsIgnoreCase("medium")) {
                System.out.println("You selected MEDIUM mode.");
                System.out.println("Game starting... Good luck!");
            } else if (difficulty.equalsIgnoreCase("hard")) {
                System.out.println("You selected HARD mode.");
                System.out.println("Game starting... Good luck!");
            } else {
                System.out.println("Invalid difficulty. Please choose easy, medium, or hard.");
            }

        } else if (choice == 2) {
            System.out.println("You selected Option 2: Load Game");

        } else if (choice == 3) {
            System.out.println("You selected Option 3: Settings");
            System.out.println("----- Game Settings -----");
            System.out.println("Type: volume, brightness, or sensitivity");
            System.out.print("Enter setting: ");

            String setting = input.next();

            if (setting.equalsIgnoreCase("volume")) {
                System.out.println("Volume: 80%");
                System.out.println("Volume setting selected.");
            } else if (setting.equalsIgnoreCase("brightness")) {
                System.out.println("Brightness: 75%");
                System.out.println("Brightness setting selected.");
            } else if (setting.equalsIgnoreCase("sensitivity")) {
                System.out.println("Sensitivity: 60%");
                System.out.println("Sensitivity setting selected.");
            } else {
                System.out.println("Invalid setting. Please choose volume, brightness, or sensitivity.");
            }

        } else if (choice == 4) {
            System.out.println("You selected Option 4: Exit");

        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        input.close();
    }
}