import java.util.Scanner;

public class Scanner_PACIS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the multiplication table you want to display: ");
        int number = input.nextInt();

        System.out.println("\nMultiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        input.close();
    }
}