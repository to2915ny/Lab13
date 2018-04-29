package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {//public class Science which inherits class Book
	
	private String publisher;//private string class type instance variable publisher
	
	public Science(String name, String publ) {//public constructor Science with parameter String name and string publ
		
		super(name);//store name to bookName which is in superclass Book
		this.publisher = publ; //store publ to instance variable publisher
	}
	
	public String toString()//public method toString which returns string type value
	{
		return super.toString() + "\n\tPublisher: " + publisher;// return toString from super class and publisher
		
	}
	public void show() {//public method show
		System.out.println("<<<Science>>>" + this.toString());//print out <<<Science>>> and toString from this class
	}
}
