package interfacee;

public class ICICIBank implements Bank{

	@Override
	public void roi() {
		System.out.println("ICICIBank -- ROI");
		
	}

	@Override
	public void savingAc() {
		System.out.println("ICICIBank -- savingAc");
		
	}

	@Override
	public void cc() {
		System.out.println("ICICIBank -- cc");
		
	}

}
