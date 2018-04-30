package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner; //import class Scanner to use

public class Master {//public class Master
	public void feed(Pet pet) {//public method feed with parameter Pet->class which implements interface Pet pet->instance 
		
		System.out.println("feed: " + pet.food());//print out "feed" and food of the animal
		
	}
	public static void main(String[] args) {
		
		String cat_name,dog_name;// local String variable cat_name and dog_name
		
		Master master = new Master();//instantiate Master to master
		Cat cat = new Cat();//instantiate Cat to cat
		Dog dog = new Dog();//instantiate Dog to dog
		
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner to type things in
		System.out.println("Enter the name of cat and dog");//print out "Enter the name of cat and dog"
		cat_name = keyboard.next();//store input to cat_name
		dog_name = keyboard.next();//store input to dog_name
		
		cat.setName(cat_name);//set cat_name to Cat
		cat.getName();//print out Cat's name
		master.feed(cat);//print out the food of the Pet
		
		dog.setName(dog_name);//set dog_name to Dog
		dog.getName();//print out Dog's name
		master.feed(dog);//print out the food of the Pet

	}

}
