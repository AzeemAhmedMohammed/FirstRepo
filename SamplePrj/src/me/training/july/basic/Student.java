//Creating two classes and demonstrate main method in another class

package me.training.july.basic;
	//Defining a Student class.
	class Student {
	//defining fields
	int id;
	int number;
	//field or data member or instance members 
	String name;
	//creating main method inside Student class
	
	
	
	
	
	public static void main(String args[]) {
	//creating an Object or instance
		Student s1=new Student();
		// printing value of the object
		System.out.println(s1.id);
		System.out.println(s1.number);
		System.out.println(s1.name);
	}
	}