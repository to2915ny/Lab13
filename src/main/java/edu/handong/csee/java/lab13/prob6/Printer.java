package edu.handong.csee.java.lab13.prob6;

public class Printer {//public class Printer
	public static void print(Object object)//public static method print which has parameter instance object from Class Object
	{
	String str = object.toString();//store toString method into String str
	if(object instanceof CapitalPrint)//if instance object is instance of CapitalPrint
	str = str.toUpperCase();//then change string in str to capital letter
	System.out.println(str);//print out str
	}



}
