package me.training.july.basic;

		class Employee1{
	int id;
	String name;
	float salary;
	
		void insert(int i, String n, float s) {
		
		id=i;
		name=n;
		salary=s;
		}
		void display() {
		
		System.out.println(id+" "+name+" "+salary);}
}

		public class TestEmployee {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1=new Employee1();
		Employee1 e2=new Employee1();
		Employee1 e3=new Employee1();
		
		e1.insert(1001, "Saleem", 30000);
		e2.insert(1002, "Waseem", 20000);
		e3.insert(1003, "Azeem", 10000);
		
		e1.display();
		e2.display();
		e3.display();
	}

}
