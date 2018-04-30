package edu.handong.csee.java.lab13.prob6;

public class Prob6 {//public class Prob6

	public static void main(String[] args) {//main
		
		UpPoint p1 = new UpPoint(3,3);//instantiate class UpPoint to p1 and pass on value 3 and 3
		DownPoint p2 = new DownPoint(2,5);//instantiate class DownPoint to p2 and pass on value 2 and 5
		DownPoint p3 = new DownPoint(4,7);//instantiate class DownPoint to p3 and pass on value 4 and 7
		UpPoint p4 = new UpPoint(9,12);//instantiate class UpPoint to p4 and pass on value 9 and 12
		Printer.print(p1);//call print method from Printer and pass on instance p1
		Printer.print(p2);//call print method from Printer and pass on instance p2
		Printer.print(p3);//call print method from Printer and pass on instance p3
		Printer.print(p4);//call print method from Printer and pass on instance p4

	}

}
