package abs;

public abstract class Car {

//	Abstraction is a process of hiding the implementation details & 
//	showing only functionality to the user
//	We can achieve 0 to 100% Abstraction
	
//	unimplemented method
	public abstract void petrol();   // abstract method 
	
	public void deisel() {  // Non-abstract method
		System.out.println("Disel method");
	}
	
	public void cngCar() { // Non-abstract method
		System.out.println("CNG method");
	}
	
	public abstract void electronic();  // abstract method
	
}
