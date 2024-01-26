package interfacee;

public class BankRunClass {

	public static void main(String[] args) {
		
//		Bank objBank = new Bank(); Cannot instantiate the type Bank
//		We can't create object of interface
		
		ICICIBank objICICIBank = new ICICIBank();
		objICICIBank.cc();
		objICICIBank.deposit();
		objICICIBank.roi();
		objICICIBank.savingAc();
		
		Bank objBank = new ICICIBank();

	}

}
