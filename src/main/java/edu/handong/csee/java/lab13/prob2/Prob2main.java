package edu.handong.csee.java.lab13.prob2;

public class Prob2main {
	
	public static void main(String[] args)
	{
		Book book = new Book("Simple Book");
		Science science = new Science("Hello Physics", "ScienceWorld");
		History history = new History("What is histroy?", "E.H.Carr");
		History history1 = new History("The South Korea", "Judis");
		
		book.show();
		science.show();
		history.show();
		history1.show();
	}

}
