package com.tw.academy.basic.$3_feature_envy.practiceTwo;

public class LineItem {
	private final String description;
	private final double price;
	private final int quantity;

	public LineItem(String description, double price, int quantity) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	public double getSubPrice() {
		return price * quantity;
	}
}
