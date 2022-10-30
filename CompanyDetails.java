package com.method;

public class CompanyDetails {
	public void companyId() {
		System.out.println("Company Id is 76465");
	}
	public void companyName() {
		System.out.println("Company Name is Gesco pvt ltd");
	}
	public void companyAddress() {
		System.out.println("Company Address is Ambattur");
	}
	public static void main(String[] args) {
		CompanyDetails c=new CompanyDetails();
		c.companyId();
		c.companyName();
		c.companyAddress();

	}

}
