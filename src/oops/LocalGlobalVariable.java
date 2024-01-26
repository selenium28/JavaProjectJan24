package oops;

public class LocalGlobalVariable {
	
	public static int m = 50; //  Global variables:  Scope of the Global variables within the hole class
	int n =100;

	public static void main(String[] args) {
		
//		Scope of the local variables within the method
		int a = 10;   // local variable 
		System.out.println(a);
		add();
		
		LocalGlobalVariable obj = new LocalGlobalVariable();
		obj.display();
		System.out.println(obj.n);
		System.out.println("n+a: " +(obj.n+a));
		
	}
	
	public static void add() {
		int b = 20;
		int c = m + b;
		System.out.println("A+B: " +c);
		
	}
	
	public void display() {
		System.out.println(m);
		System.out.println(m+n);
	}

}
