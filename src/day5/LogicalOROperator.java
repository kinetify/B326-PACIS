public class LogicalOROperator {

    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isHoliday = false;

        boolean noClasses = isWeekend || isHoliday;

        if (noClasses) {
            System.out.println("There are no classes today.");
        } else {
            System.out.println("There are classes today.");
        }
    }
}
