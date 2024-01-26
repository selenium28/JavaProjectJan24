package encap;

public class Encapsulation {
	
//	private: access only within the class
	
	private int rollNo;  // global variables 
	private String name;
	private double marks;
	
//	By using setter & getter methods we can access within the class.
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int roll) {   // local parameters
		rollNo = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String nam) {
		name = nam;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double mark) {
		marks = mark;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Rajanikant");
		obj.setRollNo(125);
		obj.setMarks(78.22);
		
		System.out.println("Name: " +obj.getName());
		System.out.println("Marks: " +obj.getMarks());
		System.out.println("RollNo: " +obj.getRollNo());

	}

}
