package edu.handong.csee.java.lab13.prob2;

public class History extends Book {//public class History which inherits class Book
	
	private String author;//private String class type instance variable author
	
	public History(String name, String author)// constructor History with parameter String name and String author
	{
		super(name);
		this.author = author;
	}
	public String toString()
	{
		return super.toString() + "\n\tAuthor: " + author;
	}
	public void show()
	{
		System.out.println("<<<History>>>" + this.toString());
	}

}
