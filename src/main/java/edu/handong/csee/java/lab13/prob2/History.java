package edu.handong.csee.java.lab13.prob2;

public class History extends Book {//public class History which inherits class Book

	private String author;//private String class type instance variable author

	public History(String name, String author)// constructor History with parameter String name and String author
	{
		super(name);// store name to bookName which is in superclass Book
		this.author = author;// store String type author into instance variable author
	}
	public String toString()//public method toString which returns String type
	{
		return super.toString() + "\n\tAuthor: " + author;//return toString in superclass and author
	}
	public void show()//public method show
	{
		System.out.println("<<<History>>>" + this.toString());//print out <<<History>>> and this class's method toString
	}

}
