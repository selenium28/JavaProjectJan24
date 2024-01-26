package abs;

public class RunClass {

	public static void main(String[] args) {
		
//		Car objCar = new Car(); We can't create object of Abstract class why because in abstract class we have unimplemented methods. 
//		[Error]-Cannot instantiate the type Car
		
		NexonCar objNexonCar = new NexonCar();
		objNexonCar.cngCar();
		objNexonCar.deisel();
		objNexonCar.petrol();
		objNexonCar.electronic();
		objNexonCar.topmodel();

	}

}
