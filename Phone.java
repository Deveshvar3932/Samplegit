package com.method;

public class Phone {
	public void phoneName() {
		System.out.println("Phone Name is Redmi 9 power");
	}
	public void phoneMieino() {
		System.out.println("Phone MIEI no is 947756673327");
	}
	public void phoneCamera() {
		System.out.println("Phone Camera is 8MP pixel");
	}
	public void phoneStorage() {
		System.out.println("Phone Storage is 128GB");
	}
	public void phoneOs() {
		System.out.println("Phone os is 12.2");
	}
	public static void main(String[] args) {
		Phone p=new Phone();
		p.phoneName();
		p.phoneMieino();
		p.phoneCamera();
		p.phoneStorage();
		p.phoneOs();
	}


}
