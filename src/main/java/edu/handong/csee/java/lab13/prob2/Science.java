package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {
	
	private String publisher;
	
	public Science(String name, String publ) {
		
		super(name);
		this.publisher = publ;
	}
	
	public String toString()
	{
		return super.toString() + "\n\tPublisher: " + publisher;
		
	}
	public void show() {
		System.out.println("<<<Science>>>" + this.toString());
	}
}
