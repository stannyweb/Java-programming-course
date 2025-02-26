package chapter6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ItemizedBill {
    final private static Scanner scanner = new Scanner(System.in);
    private PhoneBillRedo phoneBill;

    public static void main(String[] args) {

        ItemizedBill itemizedBill = new ItemizedBill();

        itemizedBill.getUserInfo();
        itemizedBill.phoneInfoBilling();

        scanner.close();

    }

    public void getUserInfo() {
        try {
            System.out.println("Enter your ID:");
            String userId = scanner.nextLine();

            System.out.println("Enter your base cost plan:");
            double userBaseCostPlan = scanner.nextDouble();

            System.out.println("Enter your allowed Minutes:");
            int userAllowedMinutes = scanner.nextInt();

            System.out.println("Enter minutes Used:");
            int userMinutesUsed = scanner.nextInt();

            phoneBill = new PhoneBillRedo(userId, userBaseCostPlan, userAllowedMinutes, userMinutesUsed);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid data.");
            scanner.nextLine();
            getUserInfo();
        }
    }

    public void phoneInfoBilling() {

        if (phoneBill == null) {
            System.out.println("No phone bill information available.");
            return;
        }

        System.out.println("User Info");
        System.out.println();
        System.out.println("UserID: " + phoneBill.getId());
        System.out.println("Plan Cost $" + phoneBill.getBaseCost());
        System.out.println("Allowed Minutes: " + phoneBill.getAllotedMinutes());
        System.out.println("Minutes Used: " + phoneBill.getMinutesUsed());
        System.out.println();
        System.out.println("Bill Statement");
        System.out.println("Extra minutes Charged: $" + phoneBill.calculateExtraMinutesUsed());
        System.out.println("Tax: $" + String.format("%.2f", phoneBill.calculateTax()));
        System.out.println("Total Cost: $" + String.format("%.2f", phoneBill.totalCostBill()));
    }

}
