package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape {//public class Rectangle which inherits class Shape

	private double length;//private instance variable double length
	private double width;//private instance variable double width
	public Rectangle(double length, double width)//public constructor method with parameter double length and double width
	{
		this.length = length;//put length into instance variable length
		this.width = width;//put width into instance variable width
	}
	public double area()//public method area which returns double type value
	{
		return length * width;//return length time width
	}
	public double perimeter()//public method perimeter which return double type value
	{
		return 2*(length+width);//return 2*(length+width)
	}
	public double get_Length()//getter which returns type double value
	{
		return length;//return length
	}
	public double get_Width()//getter which return type double value
	{
		return width;//return width
	}


}
