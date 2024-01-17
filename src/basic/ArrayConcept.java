package basic;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// Array: To store similar data types in array variable
//		Array start from index -> starting from zero
//		int a = 10;   a -> normal variable
//		int b = 20;
//		int c = 30;
//		int d = 40;
		
		int a[] = new int[8];   // a[] --> array of variable   // declaration & Initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		a[6] = 70;
		a[7] = 80;
//		a[5] = 60;   --> ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		
		System.out.println(a[2]);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		double d[] = new double[5];

	}

}
