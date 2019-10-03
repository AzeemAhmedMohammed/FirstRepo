// Create multiple objects and initiate through reference Variable
package me.training.july.basic;

	class Student3{
	int id;
	String name;
	
}


public class TestStudent3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s1=new Student3();
		Student3 s2=new Student3();
		
		s1.id=1001;
		s2.id=1002;
		s1.name="Karan";
		s2.name="Arjun";
		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
	}

}
