package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;


    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double totalPayed = super.pay() + getTotalSales() * getCommissionRate();
        this.setTotalSales(0);
        return totalPayed;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTotal Sales: USD " + getTotalSales() +
                "\nCommission Rate: " + String.format("%.2f", getCommissionRate() * 100) + " %";
    }
}
