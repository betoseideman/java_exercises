package entities;

public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("ComboDevice Print: " + doc);
			
	}

	@Override
	public String scanner() {
		return "Combo Scan result";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo ProcessDoc: " + doc);
	}
	
}