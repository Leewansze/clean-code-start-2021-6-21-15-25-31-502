package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    public static final double sales_tax_rate_10_percent = .10;
    public static final String sales_tax_printer = "Sales Tax";
    public static final String total_amount_printer = "Total Amount";
    public static final char spacing = '\t';
    public static final char line_break = '\n';
    public static final String printer_orders_header = "======Printing Orders======\n";

    private final Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    //Deprecated
    public String printCustomerName() {
        return order.getCustomerName();
    }

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        // print headers
        output.append(printer_orders_header);

        // print date, bill no, customer name
        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());

        // prints lineItems
        double totalSalesTax = 0d;
        double totalAmount = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append(spacing);
            output.append(lineItem.getPrice());
            output.append(spacing);
            output.append(lineItem.getQuantity());
            output.append(spacing);
            output.append(lineItem.totalAmount());
            output.append(line_break);

            // calculate sales tax @ rate of 10%
            double salesTax = lineItem.totalAmount() * sales_tax_rate_10_percent;
            totalSalesTax += salesTax;

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            totalAmount += lineItem.totalAmount() + salesTax;
        }

        // prints the state tax
        output.append(sales_tax_printer).append(spacing).append(totalSalesTax);

        // print total amount
        output.append(total_amount_printer).append(spacing).append(totalAmount);
        return output.toString();
    }
}
