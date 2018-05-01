package edu.handong.csee.java.lab13.prob2;

public class Book {//public class Book
	private static int idCount = 0;//private class variable idCount
	private String bookName;//private String class type bookName
	private int id;//private int instance variable id 
	public Book(String name)//constructor method Book with parameter String name
	{

		this.bookName = name;//store String name from parameter to instance variable String bookName
		idCount++;//increment idCount
		id = idCount;//store idCount into id
	}

	public String toString() {//public method toString which return in String

		return "\n\tID: " + id + "\n\tBook Name: " + bookName; // return id number, bookname

	}

	public void show() {// public method show
		System.out.println("<<<BOOK>>>" + this.toString());//print out <<<BOOK>> and method toString
	}

}
