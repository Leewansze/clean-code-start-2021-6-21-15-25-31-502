package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {

    public static final int min_eight_percent_off_consumption = 100;
    public static final int max_eight_percent_off_consumption = 150;
    public static final int min_five_percent_off_consumpption = 150;
    public static final int max_five_percent_off_consumption = 400;
    public static final double eight_percent_off = 0.8;
    public static final double five_percent_off = 0.5;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= min_eight_percent_off_consumption && cumulativeExpensesThisMonth < max_eight_percent_off_consumption) {
            return originalPrice * eight_percent_off;
        }
        if (cumulativeExpensesThisMonth >= min_five_percent_off_consumpption && cumulativeExpensesThisMonth < max_five_percent_off_consumption) {
            return originalPrice * five_percent_off;
        }
        return originalPrice;
    }
}
