package oops;

public class Animal_ClassAndObject {

	public static void main(String[] args) {
		
//		Animal_ClassAndObject --> class name
//		object --> Reference Variable
//		new --> keyword: It will assigned some memory in Java Memory
//		Animal_ClassAndObject()  --> Constructor
//		new Animal_ClassAndObject();  --> Object
		
		Animal_ClassAndObject object = new Animal_ClassAndObject();
		object.cat();
		object.dog();

	}
	
	public void dog() {
		System.out.println("Dog can eat");
	}
	
	public void cat() {
		System.out.println("Cat can run");
	}
	
	

}
