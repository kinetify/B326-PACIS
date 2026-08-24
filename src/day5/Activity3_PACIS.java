public class Activity3_PACIS {

    public static void main(String[] args) {

        boolean isWeekend = true, isHoliday = false;
        System.out.println((isWeekend || isHoliday) ? "No classes today." : "There are classes today.");

        int score = 78;
        System.out.println("Status: " + ((score >= 75) ? "Passed" : "Failed"));

        int num = 123, num2 = 456;
        System.out.println("Larger number: " + ((num > num2) ? num : num2));
    }
}