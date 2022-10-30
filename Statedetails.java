package com.method;

public class Statedetails {
	public void northIndia() {
		System.out.println("Fav food in North India is Chappathi");
	}
	public void southIndia() {
		System.out.println("Fav food in South India is Idly");
	}
	public static void main(String[] args) {
		Statedetails s=new Statedetails();
		s.northIndia();
		s.southIndia();
		Language l=new Language();
		l.tamil();
		l.english();
		l.hindi();

	}

}
