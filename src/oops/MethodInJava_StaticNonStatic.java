package oops;

public class MethodInJava_StaticNonStatic {
	 int a = 10;

//	method inside method is not allowed
//	Non-static methods calls by using object.
//	static methods call by using class name or direct calling 
	
	public static void main(String[] args) {
	
		MethodInJava_StaticNonStatic sat = new MethodInJava_StaticNonStatic();
		sat.sub();
		sat.sum();
		MethodInJava_StaticNonStatic.divide();   // By using class name 
		multiply();                              // Direct calling
		sat.display();
	}
	
	public void sum() {
		int a = 20;
		int b = 40;
		int c = a+b;
		System.out.println("a+b: " +c);
		
	}
	
	public static void divide() {
		int m = 100;
		int n = 5;
		int k = m/n;
		System.out.println("m/n: " +k);
	}
	
	public void sub() {
		int a = 200;
		int b = 50;
		int c = a-b;
		System.out.println("a-b: "+c);
		
	}
	
	public static void multiply() {
		int m = 100;
		int n = 5;
		int k = m*n;
		System.out.println("m*n: " +k);
	}
	
	public void display() {
		System.out.println("Rajanikant");
	}
	

}
