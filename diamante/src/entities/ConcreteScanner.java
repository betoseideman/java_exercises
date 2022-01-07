package entities;

public class ConcreteScanner extends Device implements Scanner{

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
		
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner Processing: " + doc);
	}
	@Override
	public String scanner() {
		return "Scanned content";
	}
	
	
	}