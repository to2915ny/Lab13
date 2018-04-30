package edu.handong.csee.java.lab13.prob1;

public class Prob1 {//public class Prob1

	public static void main(String[] args) {//public method main
		
		Friend friend1 = new Friend();//instantiate class Friend to friend1
		SchoolFriend friend2 = new SchoolFriend();//instantiate class SchoolFriend to friend2
		ClassFriend friend3 = new ClassFriend();//instantiate class ClassFriend to friend3
		
		//since method whatFriend is static class Instanceof does not need instantiation. 
		InstanceOf.whatFriend(friend1);//call whatFriend method with parameter friend1
		InstanceOf.whatFriend(friend2);//call whatFriend method with parameter friend2
		InstanceOf.whatFriend(friend3);//call whatFriend method with parameter friend3
		

	}

}
