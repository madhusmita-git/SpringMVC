package com.mkyong.customer.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Coffee")
public class Coffee {
	private String name;
	private int quantity;
	
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	@XmlElement
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Coffee() {
	}
	
	public Coffee(String name, int qty) {
		this.name = name;
		this.quantity = qty;
	}
}
