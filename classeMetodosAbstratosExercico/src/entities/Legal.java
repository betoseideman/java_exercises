package entities;

public class Legal extends Person{
	private Integer EmployeeNumbers;
	
	public Legal() {
		super();
	}
	

	public Legal(String name, Double annualIncome, Integer employeeNumbers) {
		super(name, annualIncome);
		EmployeeNumbers = employeeNumbers;
	}
	


	public Integer getEmployeeNumbers() {
		return EmployeeNumbers;
	}


	public void setEmployeeNumbers(Integer employeeNumbers) {
		EmployeeNumbers = employeeNumbers;
	}


	@Override
	public double incomeTax() {
		if(EmployeeNumbers > 10) {
			return getAnnualIncome() * 0.14;
		}
		else {
			return getAnnualIncome() * 0.16;
		}
		
	}

}
