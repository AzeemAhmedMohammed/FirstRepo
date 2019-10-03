//create multiple objects and initiate through methods
package me.training.july.basic;

	class Student4{
	
	int rollno;
	String name;
	
	void insertRecord(int r, String n) { //create method to initiate variables
	
	rollno=r;
	name=n;
	}
	void displayInformation() {
		
		System.out.println(rollno+" "+name);
		
	}// create method to initiate PrintStream
	
	}


public class TestStudent4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 s1=new Student4();  //create Objects
		Student4 s2=new Student4();
		
		s1.insertRecord(1023,"Azeem"); //initiate object and variable through method
		s2.insertRecord(1024,"Adam");
		
		s1.displayInformation(); //return display information through method
		s2.displayInformation();
		
	}

}
