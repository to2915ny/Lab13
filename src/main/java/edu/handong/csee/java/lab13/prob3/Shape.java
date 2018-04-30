package edu.handong.csee.java.lab13.prob3;

public abstract class Shape {//public abstract class Shape
	public abstract double area();//public abstract method area
	public abstract double perimeter();//public abstract method perimeter
	public void display()//public method display
	{
	System.out.println("Area: "+area()+"\nPerimeter: "+perimeter() +"\n"); //priint out area perimeter of the shape
	}

}
