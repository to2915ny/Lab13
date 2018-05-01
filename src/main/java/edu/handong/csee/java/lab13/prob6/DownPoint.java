package edu.handong.csee.java.lab13.prob6;

public class DownPoint  {//public class DownPoint
	private int x, y;//private instance variable int x and y
	DownPoint(int x, int y){//constructor method with parameter int x and y
		this.x = x; //store x into instance variable x
		this.y = y;//store y into instance varaible y
	}
	public String toString()//public method toString which returns String type
	{
		return "x : " + x + " y : " + y;//return the string value
	}

}
