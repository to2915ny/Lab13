package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape{//public class Circle which inherits class Shape
	
	private double radius;//private double instance variable radius
	public Circle(double r)//public constructor with parameter double r
	{
	radius = r;//put r into instance variable radius
	}
	public double area()//public method which returns double
	{
	return Math.PI * Math.pow(radius, 2); // pi * r * r
	}
	public double perimeter()//public method which returns double
	{
	return 2.0 * Math.PI * radius; // 2 * pi * radius
	}
	public double get_Radius()//public method get_Radius which returns double
	{
	return radius;//return double value radius
	}


}
