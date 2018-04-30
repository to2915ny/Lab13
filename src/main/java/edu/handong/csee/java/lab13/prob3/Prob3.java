package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;//import scanner class to use

public class Prob3 {//public class Prob3

	public static void main(String[] args) {
		
			double n1, n2;//local variable double n1 and n2
			Scanner keyboard = new Scanner(System.in);//instantiate scanner to keyboard so user can input data

			System.out.print("Enter radius: ");//print out "Enter radius"
			n1 = keyboard.nextDouble();//input value into n1
			Circle c1 = new Circle(n1);//instantiate Circle to c1 and pass on n1 value

			System.out.println("Radius: "+ c1.get_Radius());//print out "Radius" and get c1's radius
			c1.display();//display the area and perimeter of the circle c1

			System.out.print("Enter length and width: ");//print out "Enter length and width"
			n1 = keyboard.nextDouble();//input value into n1
			n2 = keyboard.nextDouble();//input value into n2
			Rectangle r1 = new Rectangle(n1, n2);//instantiate Rectangle to r1 and pass on the length(n1) and width(n2)

			System.out.println("Length: "+ r1.get_Length());//print out "Length" and get r1's length
			System.out.println("Width: "+ r1.get_Width());//print out "Width" and get r1's width
			r1.display();//display the area and perimeter of the rectangle r1
			


		
	}

}
