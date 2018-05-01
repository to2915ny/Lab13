package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrint {//public class UpPoint which implements interface CapitalPrint
	private int x, y; //private instance variable int x and y

	UpPoint(int x, int y){//Constructor method with parameter int x and int y
		this.x = x;//store x into instance variable x
		this.y = y;//store y into instance variable y
	}

	public String toString()//public method toString which returns String type value
	{
		return "x : " + x + " y : " + y;//return string
	}

}
