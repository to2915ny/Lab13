package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;//import class scanner to use

public class Equals {//public class Equals
	public static boolean equals(int[][] m1, int[][] m2) {//public static boolean method equals.
		//Has parameter int double array m1 and m2 and because it is a boolean type it return true or false
		int count = 0;//local variable int count
		if (m1.length != m2.length) // if the number of row is different, return false
		return false;
		      for (int i = 0; i < m1.length; i++) //for i =0 and i is less than row size
		      {
		            for (int j = 0; j < m1[i].length; j++) //and for each m1[i]s
		            {
		                if (m1[i][j] != m2[i][j])//if array of m1 and m2 is not equal
		                count++;//increment count
		            }
		      }
		      if(count <= 3)//if count is less or equal to 3
		         return true;//return true
		      else
		         return false;//else return false
		}

	public static void main(String[] args) {//main
		
		int n1, n2 = 0;//local variable n1 and n2
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner to keyboard so user can input data
		System.out.print("Enter row size(maximum 5): ");//print out "Enter row size(maximum5)
		n1 = keyboard.nextInt();//input data in n1
		System.out.print("Enter column size(maximum 5): ");//print out "Enter column size(maximum5)
		n2 = keyboard.nextInt();//input data in n2
		int[][] m1 = new int[n1][n2];//set array m1 size with n1 and n2
		System.out.print("Enter row size(maximum 5): ");//print out "Enter row size(maximum5)
		n1 = keyboard.nextInt();//input data in n1
		System.out.print("Enter column size(maximum 5): ");//print out "Enter column size(maximum5)
		n2 = keyboard.nextInt();//input data in n2
		int[][] m2 = new int[n1][n2];//set array m2 with n1 and n2
		
		    System.out.print("Enter List1: ");//print out Enter List 1
		    for (int i = 0; i < m1.length; i++)//for each row
		    for (int j = 0; j < m1[i].length; j++)//for each corresponding column
		                m1[i][j] = keyboard.nextInt();//input data into the array
		    System.out.print("Enter list2: ");//print out Enter List 2
		    for (int i = 0; i < m2.length; i++){//for each row
		       for (int j = 0; j < m2[i].length; j++)//for each corresponding column
		                   m2[i][j] = keyboard.nextInt();//input data into the array
		    }
		    for (int i = 0; i < m1.length; i++){
		       for (int j = 0; j < m1[i].length; j++)
		         System.out.print(m1[i][j] + " ");//print out entered values in list1
		       System.out.println();//enter a line
		    }
		    System.out.println();//enter a line
		    for (int i = 0; i < m2.length; i++){//print out entered value in list2
		       for (int j = 0; j < m2[i].length; j++)
		         System.out.print(m2[i][j] + " ");
		       System.out.println();//enter a line
		    }
		    System.out.println();//enter a line
		                  
		        
		       if (equals(m1, m2)) //if value is true
		       	System.out.println("The two arrays are approximately identical.");//print out the two arrays are approximately identical
		       else 
		       	System.out.println("The two arrays are not identical");//else false the two arrays are not identical



		   }



		   

	}


