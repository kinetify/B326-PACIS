import java.util.Scanner;

public class Activity9_PACIS2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("           Average Calculator");
        System.out.println("======================================");

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt();

        input.nextLine();

        String[] subjectNames = new String[subjects];
        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];
        double[] averages = new double[students];

        System.out.println("\nEnter subject names:");

        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();
        }

        for (int i = 0; i < students; i++) {

            System.out.print("\nName of Student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();

            System.out.println("Enter grades for each subject:");

            double sum = 0;

            for (int j = 0; j < subjects; j++) {
                System.out.print(subjectNames[j] + ": ");
                grades[i][j] = input.nextDouble();

                sum += grades[i][j];
            }

            averages[i] = sum / subjects;

            input.nextLine();
        }

        System.out.println("\n======================================");
        System.out.println("             Grades Report");
        System.out.println("======================================");

        System.out.printf("%-15s", "Student");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-15s", subjectNames[i]);
        }

        System.out.printf("%-10s%n", "Average");

        System.out.println("--------------------------------------");

        for (int i = 0; i < students; i++) {

            System.out.printf("%-15s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-15.0f", grades[i][j]);
            }

            System.out.printf("%.2f%n", averages[i]);
        }

        input.close();
    }
}