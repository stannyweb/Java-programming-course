package chapter5;

import java.util.Scanner;

public class Chapter5Exercise {
    static Scanner scanner = new Scanner(System.in);

    static double tax = 0.15;
    static double overageMinutes = 0.25;

    public static void main(String[] args) {
        double planCost = baseCostPlan();
        int extraMinutes = extraMinutes();

        scanner.close();

        double overageMinutes = calculateExtraMinutes(extraMinutes);
        double taxCost = calculateTax(planCost, overageMinutes);
        double totalCost = calculateTotal(taxCost, planCost, overageMinutes);

        phoneBillStatement(planCost, overageMinutes, taxCost, totalCost);


    }

    public static double baseCostPlan() {
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }

    public static int extraMinutes() {
        System.out.println("Enter overage minutes:");
        return scanner.nextInt();
    }

    public static double calculateExtraMinutes(int extraMinutes) {
        return extraMinutes * overageMinutes;
    }

    public static double calculateTax(double planCost, double extraMinutes) {
        return (planCost + extraMinutes) * tax;
    }

    public static double calculateTotal(double tax, double planCost, double extraMinutes) {
        return planCost + extraMinutes + tax;
    }

    public static void phoneBillStatement(double planCost, double extraMinutes, double tax, double total) {
        System.out.println("Phone Bill Statement");

        System.out.println("Plan: $" + String.format("%.2f", planCost));
        System.out.println("Overage: $" + String.format("%.2f", extraMinutes));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));

    }

}
