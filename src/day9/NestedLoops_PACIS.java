public class NestedLoops_PACIS {
    public static void main(String[] args) {

        for (int table = 1; table <= 10; table++) {

            System.out.println("Multiplication Table of " + table);

            for (int i = 1; i <= 10; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));
            }

            System.out.println();
        }
    }
}