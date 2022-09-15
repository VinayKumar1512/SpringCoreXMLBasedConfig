package com.springcore.life;

import javax.annotation.*;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init Method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside Destory Method");
	}
}
