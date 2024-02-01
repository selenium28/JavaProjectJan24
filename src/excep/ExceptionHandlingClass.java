package excep;

public class ExceptionHandlingClass {

	public static void main(String[] args) {

		final int a = 10;
		int b = 0;
		
		final String name = "Rajanikant";
		
//		Can we use single try block with multiple catch blocks?
//		Yes
//		Can we use single catch block with multiple try blocks?
//		No
//		Can we use only try block
//		Yes but with finally keyword
		
		try {
//			System.out.println(a/b);
			int i[] = new int[2];
			i[3] = 10;
			
		} catch (ArithmeticException arth) {
			System.out.println("ArithmeticException: " +arth);
		} catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("ArrayIndexOutOfBoundsException: " +e);
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		System.out.println("Rest of code.....");
		
		try {
			System.out.println(a/b);
		} finally {
			System.out.println("I am in finally block");
		}
		
		
	}

}
