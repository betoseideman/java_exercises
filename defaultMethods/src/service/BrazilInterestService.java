package service;

public class BrazilInterestService implements InterestService{
	private Double interestRate;
	
	public BrazilInterestService() {
		
	}

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
