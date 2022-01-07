package entities;

public class BusinessAccount extends Account{
private Double loanLimt;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimt) {
		super(number, holder, balance);
		this.loanLimt = loanLimt;
	}

	public Double getLoanLimt() {
		return loanLimt;
	}

	public void setLoanLimt(Double loanLimt) {
		this.loanLimt = loanLimt;
	}
	public void loan(double amount) {
		if (amount <= loanLimt) {
			balance += amount -10.0;
		}
		
	}
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

}