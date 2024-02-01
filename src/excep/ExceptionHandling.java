package excep;

public class ExceptionHandling {

	public static void main(String[] args) {
		
//		Exception is an Abnormal condition 
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");  // exception 
//		System.out.println("4");   //
		
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a/b);   // Run time exception -> ArithmeticException
		} catch (Exception e) {
			System.out.println("Exception Handled: " +e);
		}
		
		System.out.println("1");
		System.out.println("2");


	}

}
