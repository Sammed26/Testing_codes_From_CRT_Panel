package com;

public class Movie {

	int id;
	String name;
	float rating;
	int price;
	
	public Movie(int id, String name, float rating, int price)
	{
		this.id=id;
		this.name=name;
		this.rating=rating;
		this.price=price;
	}
	public static void main(String[] args) {
		Movie m1 = new Movie(1,"abc",9.9f,200);
		Movie m2 = new Movie(2,"pqr",9.5f,250);
		Movie m3 = new Movie(3,"xyz",9.4f,300);
		Movie m4 = new Movie(4,"lmn",9.2f,100);

		System.out.println("Id : "+m1.id + " "+"Name : "+m1.name);
		System.out.println("Rating : "+m1.rating+ " "+"price : "+m1.price);
		System.out.println("________________________________________");
		System.out.println("Id : "+m2.id + " "+"Name : "+m2.name);
		System.out.println("Rating : "+m2.rating+ " "+"price : "+m2.price);
		System.out.println("________________________________________");
		
	}
}
