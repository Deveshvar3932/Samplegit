package com.method;

public class Sample{
	  int a = 10;
	private void m1() {
      a=100;
	System.out.println(a);
	}
	private void m2() {
		
		System.out.println(a);	
	}
	public static void main(String[] args) {
		
		Sample s=new Sample();
		s.m2();
		s.m1();
		Sample s1=new Sample();
		s1.m2();
		s1.m1();
		
		
		
	}	
	
}