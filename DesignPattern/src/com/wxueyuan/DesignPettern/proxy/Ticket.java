package com.wxueyuan.DesignPettern.proxy;

/**
 * Author: Jesmin
 * Description: 火车票实体类
 *
 */
public class Ticket {
	private double price;

	public Ticket(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
