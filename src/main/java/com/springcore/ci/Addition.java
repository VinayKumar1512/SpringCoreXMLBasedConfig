package com.springcore.ci;

public class Addition {

	private int a;
	private int b;
	
	//by default constructor arg paramters are of string,type so they first point to string type construtor,if not found take the first
	//constructor type
	//we can use type attribute to specify the value to which constructor it must point
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor Integer");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b =(int) b;
		System.out.println("Constructor Double");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b =Integer.parseInt(b);
		System.out.println("Constructor String");
	}

	@Override
	public String toString() {
		return "Sum"+(this.a+this.b);
	}
}
