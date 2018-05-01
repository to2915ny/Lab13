package edu.handong.csee.java.lab13.prob2;

public class Prob2main {//public class Prob2main

	public static void main(String[] args)//public main method
	{
		Book book = new Book("Simple Book");//instantiate class Book to book and pass on its parameter 
		Science science = new Science("Hello Physics", "ScienceWorld");//instantiate class Science to science and pass on its parameter 
		History history = new History("What is histroy?", "E.H.Carr");//instantiate class History to history and pass on its parameter 
		History history1 = new History("The South Korea", "Judis");//instantiate class History to history1 and pass on its parameter 

		book.show();//call book's show method
		science.show();//call science's show method
		history.show();//call history's show method
		history1.show();//call history1's show method
	}

}
