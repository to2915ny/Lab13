package edu.handong.csee.java.lab13.prob4;

public class Animal {//public class Animal
	private String name;//private instance String variable name

	public	void setName(String name){//public setName method with parameter name

		this.name = name;//set name into instance variable name

	}
	public void getName(){//public getName method

		System.out.println("Name: " + name);//print out "Name:" and variable name
	}

}
