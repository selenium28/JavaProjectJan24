package oops;

public class MethodOverLoading {

	public static void main(String[] args) {

		MethodOverLoading obj = new MethodOverLoading();
		obj.display();
		obj.display(10);
		obj.display(10, 20);
		obj.display(100, 200);
		obj.display(500, 200);
	

	}
	
//	Duplicate methods are not allowed in Java.
//	Method inside method is not allowed
	
	public void display() {  // zero parameter
		System.out.println("Zero Input Parameter");
	}
	
	public void display(int a) {  // 1 parameter
		System.out.println("1 Input Parametr");
		System.out.println(a);
	}
	
	public void display(int a, int b) {  // 2 input parameter
		System.out.println("2 Input parameter");
		System.out.println("A+B: " +(a+b));
	}
	
	public void display(double d) {  // 1 parameter with diff. data types
		System.out.println("1 Input Parametr");
		
	}
	
	public void display(double m, double n) {  // 1 parameter with diff. data types
		System.out.println("1 Input Parametr");
		
	}

}
