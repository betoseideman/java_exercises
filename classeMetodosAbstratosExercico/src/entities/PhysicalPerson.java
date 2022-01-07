package entities;

public class PhysicalPerson extends Person{
	private Double healthExpenses;
	
	public PhysicalPerson() {
		super();
	}
	

	public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}
	
	public Double getHealthExpenses() {
		return healthExpenses;
	}


	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}


	@Override
	public double incomeTax() {
		
		if(getAnnualIncome() < 20000.0) {
			double tax = 0.15;
			return getAnnualIncome() * tax - healthExpenses * 0.5;
		}
		else {
			double tax = 0.25;
			return getAnnualIncome() * tax - healthExpenses * 0.5;
		}
		
		
	}

}
