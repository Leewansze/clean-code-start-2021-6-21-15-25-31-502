package com.tw.academy.basic.$7_long_method;

public class LineItem {
	public static final double sales_tax_rate_10_percent = .10;
	private final String description;
	private final double price;
	private final int quantity;

	public LineItem(String description, double price, int quantity) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

    double totalAmount() {
        return price * quantity;
    }

    public String generateLineItemList() {
		return this.description + '\t'
				+ this.price + '\t'
				+ this.quantity + '\t'
				+ this.totalAmount() + '\n';
	}

	public double getSalesTax(LineItem lineItem) {
		return lineItem.totalAmount() * sales_tax_rate_10_percent;
	}
}
