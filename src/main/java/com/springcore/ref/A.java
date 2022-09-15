package com.springcore.ref;

import org.springframework.beans.factory.annotation.*;

public class A {
	
	//we can also use Autowired anntation for autowiring-> we can use it on the data member,setter method and constructor
	private int x;
	
	
	//auto wired annoation basically inject based on type -> if we have same two or more beans same type,than we got error
	//so to avoid that we use Qualifier annoation to map bean byName
	@Autowired
	@Qualifier("ob")
	private B ob;
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public A(B ob) {
		super();
		this.ob = ob;
		System.out.println("Inside Constructor");
	}
	public A(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
		System.out.println("Inside Constructor");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
		System.out.println("Constructor Calling");
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	

}
