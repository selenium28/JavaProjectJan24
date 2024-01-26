package interfacee;

public interface Bank {
	
	public void roi();
	public void savingAc();
	public void cc();
	
	default void deposit() {
		System.out.println("Default --> deposit");
	}

}
