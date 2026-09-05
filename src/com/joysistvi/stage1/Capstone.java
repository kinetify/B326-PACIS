package com.joysistvi.stage1;

import java.util.Scanner;
public class Capstone {

    static Scanner scanner = new Scanner(System.in);

    static double balance = 1500.00;

    public static void main(String[] args) {

        welcomeScreen();
        mainMenu();

    }

    public static void welcomeScreen() {

        System.out.println();
        System.out.println("==================================================");
        System.out.println("                  V P Z O N E");
        System.out.println("             VALORANT TOP-UP SHOP");
        System.out.println("==================================================");
        System.out.println("       Fast Top-Up  |  Great Deals  |  Easy Pay");
        System.out.println("==================================================");

        System.out.println();
        System.out.println("              >>> TODAY'S PROMOS <<<");
        System.out.println();
        System.out.println("   [HOT]  Buy 1000 VP  - Get +50 Bonus VP");
        System.out.println("   [NEW]  Buy 2050 VP  - Get +100 Bonus VP");
        System.out.println("   [VIP]  Buy 3650 VP  - Get +200 Bonus VP");
        System.out.println();
        System.out.println("==================================================");
    }

    public static void mainMenu() {

        while (true) {

            System.out.println();
            System.out.println("==================================================");
            System.out.println("                    VPZONE");
            System.out.println("==================================================");
            System.out.println("[1] Buy VALORANT Points");
            System.out.println("[2] View Promos");
            System.out.println("[3] My Wallet");
            System.out.println("[4] How It Works");
            System.out.println("[0] Exit");
            System.out.println("==================================================");

            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    playerInformation();
                    break;

                case 2:
                    viewPromos();
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    howItWorks();
                    break;

                case 0:
                    exitShop();
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid option.");
                    System.out.println("Please choose from the available menu.");
                    break;
            }
        }
    }
    public static void playerInformation() {

        scanner.nextLine();

        System.out.println();
        System.out.println("==================================================");
        System.out.println("                 ACCOUNT DETAILS");
        System.out.println("==================================================");

        System.out.print("Enter Riot ID: ");
        String riotID = scanner.nextLine();

        System.out.print("Enter Tagline: ");
        String tagline = scanner.nextLine();

        while (true) {

            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("Riot ID   : " + riotID);
            System.out.println("Tagline   : #" + tagline);
            System.out.println("------------------------------------------");

            System.out.println("[1] Continue");
            System.out.println("[2] Edit Account");
            System.out.println("[0] Back");

            System.out.print("Select: ");
            int choice = scanner.nextInt();

            if (choice == 1) {

                vpPackages(riotID, tagline);
                return;

            } else if (choice == 2) {

                scanner.nextLine();

                System.out.print("Enter new Riot ID: ");
                riotID = scanner.nextLine();

                System.out.print("Enter new Tagline: ");
                tagline = scanner.nextLine();

            } else if (choice == 0) {

                return;

            } else {

                System.out.println("Invalid choice. Try again.");
            }
        }
    }
    public static void vpPackages(String riotID, String tagline) {

        while (true) {

            System.out.println();
            System.out.println("==================================================");
            System.out.println("                VP DIGITAL STORE");
            System.out.println("==================================================");

            System.out.println("Choose your VALORANT Points:");
            System.out.println();

            System.out.println("[1] 475 VP       - P250");
            System.out.println("[2] 1000 VP      - P500   [BONUS +50 VP]");
            System.out.println("[3] 2050 VP      - P1,000 [BONUS +100 VP]");
            System.out.println("[4] 3650 VP      - P1,750 [BONUS +200 VP]");
            System.out.println("[5] 5350 VP      - P2,500");
            System.out.println("[6] 11000 VP     - P5,000");
            System.out.println("[0] Back");

            System.out.println("==================================================");

            System.out.print("Select package: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    orderConfirmation(
                            riotID,
                            tagline,
                            475,
                            0,
                            250
                    );
                    return;

                case 2:
                    orderConfirmation(
                            riotID,
                            tagline,
                            1000,
                            50,
                            500
                    );
                    return;

                case 3:
                    orderConfirmation(
                            riotID,
                            tagline,
                            2050,
                            100,
                            1000
                    );
                    return;

                case 4:
                    orderConfirmation(
                            riotID,
                            tagline,
                            3650,
                            200,
                            1750
                    );
                    return;

                case 5:
                    orderConfirmation(
                            riotID,
                            tagline,
                            5350,
                            0,
                            2500
                    );
                    return;

                case 6:
                    orderConfirmation(
                            riotID,
                            tagline,
                            11000,
                            0,
                            5000
                    );
                    return;

                case 0:
                    return;

                default:
                    System.out.println();
                    System.out.println("Invalid package.");
                    System.out.println("Please select a valid package.");
            }
        }
    }
    public static void orderConfirmation(
            String riotID,
            String tagline,
            int vp,
            int bonusVP,
            double price) {

        while (true) {

            System.out.println();
            System.out.println("==================================================");
            System.out.println("                 ORDER SUMMARY");
            System.out.println("==================================================");

            System.out.println("Game             : VALORANT");
            System.out.println("Riot ID          : " + riotID);
            System.out.println("Tagline          : #" + tagline);
            System.out.println("Base VP          : " + vp);

            if (bonusVP > 0) {
                System.out.println("Promo Bonus      : +" + bonusVP + " VP");
                System.out.println("Total VP         : " + (vp + bonusVP));
            } else {
                System.out.println("Total VP         : " + vp);
            }

            System.out.println("Price            : P" + price);
            System.out.println("Wallet Balance   : P" + balance);

            System.out.println("--------------------------------------------------");

            System.out.println("[1] Proceed to Payment");
            System.out.println("[2] Choose Another Package");
            System.out.println("[3] Cancel Order");
            System.out.println("[0] Back to Main Menu");

            System.out.println("==================================================");

            System.out.print("Select: ");

            int choice = scanner.nextInt();

            if (choice == 1) {

                payment(
                        riotID,
                        tagline,
                        vp,
                        bonusVP,
                        price
                );

                return;

            } else if (choice == 2) {

                vpPackages(riotID, tagline);
                return;

            } else if (choice == 3) {

                System.out.println();
                System.out.println("Order cancelled.");
                System.out.println("Your wallet was not charged.");

                return;

            } else if (choice == 0) {

                return;

            } else {

                System.out.println();
                System.out.println("Invalid option.");
            }
        }
    }
    public static void payment(
            String riotID,
            String tagline,
            int vp,
            int bonusVP,
            double price) {

        while (true) {

            System.out.println();
            System.out.println("==================================================");
            System.out.println("                    PAYMENT");
            System.out.println("==================================================");

            System.out.println("Order Amount       : P" + price);
            System.out.println("Wallet Balance     : P" + balance);

            System.out.println();
            System.out.println("[1] VPZone Wallet");
            System.out.println("[2] Cancel Payment");

            System.out.print("Select payment method: ");

            int choice = scanner.nextInt();

            if (choice == 1) {

                if (balance >= price) {

                    balance = balance - price;

                    successfulPurchase(
                            riotID,
                            tagline,
                            vp,
                            bonusVP,
                            price
                    );

                    return;

                } else {

                    System.out.println();
                    System.out.println("==================================================");
                    System.out.println("              INSUFFICIENT BALANCE");
                    System.out.println("==================================================");

                    System.out.println("Wallet Balance : P" + balance);
                    System.out.println("Required       : P" + price);
                    System.out.println();
                    System.out.println("Please choose another package or");
                    System.out.println("return to the main menu.");

                    return;
                }

            } else if (choice == 2) {

                System.out.println();
                System.out.println("Payment cancelled.");
                return;

            } else {

                System.out.println();
                System.out.println("Invalid payment option.");
            }
        }
    }
    public static void successfulPurchase(
            String riotID,
            String tagline,
            int vp,
            int bonusVP,
            double price) {

        String orderID =
                "VPZ-" + (int)(Math.random() * 900000 + 100000);

        int totalVP = vp + bonusVP;

        System.out.println();
        System.out.println();
        System.out.println("==================================================");
        System.out.println("              PAYMENT SUCCESSFUL!");
        System.out.println("==================================================");

        System.out.println();
        System.out.println("Order ID        : " + orderID);
        System.out.println("Game            : VALORANT");
        System.out.println("Riot ID         : " + riotID);
        System.out.println("Tagline         : #" + tagline);

        System.out.println("--------------------------------------------------");

        System.out.println("Purchased VP    : " + vp);

        if (bonusVP > 0) {
            System.out.println("Promo Bonus     : +" + bonusVP);
        }

        System.out.println("Total VP        : " + totalVP);

        System.out.println("Amount Paid     : P" + price);
        System.out.println("Payment Status  : SUCCESS");
        System.out.println("Order Status    : COMPLETED");

        System.out.println("--------------------------------------------------");

        System.out.println("Remaining Wallet: P" + balance);

        System.out.println();
        System.out.println("Your VALORANT Points top-up has");
        System.out.println("been successfully completed!");

        System.out.println();
        System.out.println("==================================================");
        System.out.println("             THANK YOU FOR SHOPPING!");
        System.out.println("==================================================");

        System.exit(0);
    }

    public static void viewPromos() {

        while (true) {

            System.out.println();
            System.out.println("==================================================");
            System.out.println("                 VPZONE PROMOS");
            System.out.println("==================================================");

            System.out.println();
            System.out.println("[HOT DEAL]");
            System.out.println("1000 VP Package");
            System.out.println("Get +50 BONUS VP");
            System.out.println();

            System.out.println("[SUPER DEAL]");
            System.out.println("2050 VP Package");
            System.out.println("Get +100 BONUS VP");
            System.out.println();

            System.out.println("[VIP DEAL]");
            System.out.println("3650 VP Package");
            System.out.println("Get +200 BONUS VP");
            System.out.println();

            System.out.println("==================================================");

            System.out.println("[1] Buy a Promo Package");
            System.out.println("[0] Back");

            System.out.print("Select: ");

            int choice = scanner.nextInt();

            if (choice == 1) {

                playerInformation();
                return;

            } else if (choice == 0) {

                return;

            } else {

                System.out.println();
                System.out.println("Invalid option.");
            }
        }
    }

    public static void checkBalance() {

        while (true) {

            System.out.println();
            System.out.println("==================================================");
            System.out.println("                   MY WALLET");
            System.out.println("==================================================");

            System.out.println();
            System.out.println("Available Balance: P" + balance);

            System.out.println();
            System.out.println("[1] Back");
            System.out.println("[0] Exit");

            System.out.print("Select: ");

            int choice = scanner.nextInt();

            if (choice == 1) {

                return;

            } else if (choice == 0) {

                exitShop();
                return;

            } else {

                System.out.println();
                System.out.println("Invalid option.");
            }
        }
    }

    public static void howItWorks() {

        while (true) {

            System.out.println();
            System.out.println("==================================================");
            System.out.println("                  HOW IT WORKS");
            System.out.println("==================================================");

            System.out.println();
            System.out.println("1. Enter your Riot ID and Tagline.");
            System.out.println("2. Select your preferred VP package.");
            System.out.println("3. Review your order.");
            System.out.println("4. Choose a payment method.");
            System.out.println("5. Complete your purchase.");
            System.out.println("6. Receive your VP top-up.");

            System.out.println();
            System.out.println("==================================================");

            System.out.println("[1] Back to Main Menu");
            System.out.println("[0] Exit");

            System.out.print("Select: ");

            int choice = scanner.nextInt();

            if (choice == 1) {

                return;

            } else if (choice == 0) {

                exitShop();
                return;

            } else {

                System.out.println();
                System.out.println("Invalid option.");
            }
        }
    }

    public static void exitShop() {

        System.out.println();
        System.out.println("==================================================");
        System.out.println("                 EXIT VPZONE");
        System.out.println("==================================================");

        System.out.println("Thank you for visiting VPZone!");
        System.out.println("Come back again for more VP promos.");

        System.out.println("==================================================");

        System.exit(0);
    }
}