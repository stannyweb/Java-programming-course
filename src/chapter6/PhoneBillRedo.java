package chapter6;

/*
So, a phone bill should have an ID, a base class, a number of allotted minutes and a number of minutes used. And then,
it should also be able to calculate the overage, calculate the tax, and calculate the total.

And then, it should also be able to print an itemized bill.

You should also include three constructors

    a default one.
    one that accepts the ID only.
    one that accepts all fields.

Now no matter which of these constructors you use, all fields should be set eventually.

Then you can also create a different class that instantiates the PhoneBill and prints out an itemized bill.
 */

public class PhoneBillRedo {

    private String id;
    private double baseCost;
    private int allowedMinutes;
    private int minutesUsed;
    final private double tax = 0.15;
    final double overageTax = 0.25;


    // Constructor 1
    public PhoneBillRedo() {
        id = "Stan";
        baseCost = 82.45;
        allowedMinutes = 6;
        minutesUsed = 10;
    }

    // Constructor 2
    public PhoneBillRedo(String id) {
        this.id = id;

    }

    // Constructor 3
    public PhoneBillRedo(String id, double baseCost, int allotedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allowedMinutes = allotedMinutes;
        this.minutesUsed = minutesUsed;

    }

    //    GETTERS
    public String getId() {
        return this.id;
    }

    public double getBaseCost() {
        return this.baseCost;
    }

    public int getAllotedMinutes() {
        return this.allowedMinutes;
    }

    public int getMinutesUsed() {
        return this.minutesUsed;
    }

    //    SETTERS
    public void setId(String id) {
        this.id = id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setAllotedMinutes(int allotedMinutes) {
        this.allowedMinutes = allotedMinutes;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

//    METHODS Calculations

    public double calculateExtraMinutesUsed() {
        double extraMinutesUsed = 0;
        if (this.minutesUsed > this.allowedMinutes) {
            extraMinutesUsed = (this.minutesUsed - this.allowedMinutes) * this.overageTax;
        }
        return extraMinutesUsed;
    }

    public double calculateTax() {
        return (this.baseCost + this.minutesUsed) * this.tax;
    }

    public double totalCostBill() {
        return this.baseCost + calculateExtraMinutesUsed() + calculateTax();
    }
}
