package day6;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month: ");
        String month = sc.nextLine();

        switch (month) {
            case "January":
            case "February":
            case "March":
                System.out.println("First Quarter of the year");
                break;
            case "April":
            case "May":
            case "June":
                System.out.println("Second Quarter of the year");
                break;
            case "July":
            case "August":
            case "September":
                System.out.println("Third Quarter of the year");
                break;
            case "October":
            case "November":
            case "December":
                System.out.println("Fourth Quarter of the year");
                break;
            default:
                System.out.println("Invalid Input! Please enter a valid month!");
                break;
        }
    }
}
