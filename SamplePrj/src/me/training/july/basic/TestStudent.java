//Creating two classes and demonstrate main method in another class

package me.training.july.basic;

class TestStudent1 {
	
	String name;
	int id;
	
}



public class TestStudent {

	public static void main(String argc[]) {
	
	TestStudent1 s1=new TestStudent1();	
		
	System.out.println(s1.id);
	System.out.println(s1.name);
	
	}
}
