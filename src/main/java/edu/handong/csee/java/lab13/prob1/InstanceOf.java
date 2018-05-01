package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {//public class InstanceOf
	public static void whatFriend(Friend friend) {//public static method whatFriend with parameter(Friend -> Class friend -> instance)

		if(friend instanceof ClassFriend)//if friend is instance of class ClassFriend
			((ClassFriend)friend).classFriend();//then use classFriend method in ClassFriend class
		else if(friend instanceof SchoolFriend)//else if friend is instance of class SchoolFriend
			((SchoolFriend)friend).schoolFriend();//then use schoolFriend method in SchoolFriend class
		else
			friend.justFriend();//else use justFriend method from Friend class
	}
}
