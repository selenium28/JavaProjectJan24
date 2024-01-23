package interf;

public class RunClass {

	public static void main(String[] args) {
		B_childClass obj = new B_childClass();
		obj.bike();  // child
		obj.car();   // parent
		B_childClass.thar();  // child
		obj.cycle();   // child
		obj.helicopter(); // parent

	}

}
