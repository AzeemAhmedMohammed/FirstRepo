package me.training.july.basic;

public class Mathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Mathematics Training");
		
		Mathematics add = new Mathematics();
		int res=add.doAdd(2,2);
		
		System.out.println(res+121);
		
		System.out.println("End of Addition");
		
		
	}

	
	public int doAdd(int a, int b) {
		System.out.println(a + b);
		return a+b;
	} 
	
	
}
