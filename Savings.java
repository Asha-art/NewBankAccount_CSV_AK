package bankaccountapp;

public class Savings extends Account {

	
	//List properties specific to a savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	//constructor to initialize settings for the savings properties
	public Savings(String name,String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber = "1"+accountNumber;
		setSafetyDepositBox();		
	}
	
	@Override
	public void setRate() {
		//System.out.println("Implement rate for Savings");
		rate = getBaseRate() - 0.25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey= (int)(Math.random() * Math.pow(10, 4));
		
	}
	//list any methods specific to savings account
	
	public void showInfo() {		
		//System.out.println("Account type: Savings");
		super.showInfo();
		System.out.println(" Your Savings Account Features"+
		"\n Safety Deposit Box ID: "+safetyDepositBoxID+
		"\n Safety Deposit Box Key: "+safetyDepositBoxKey);
		
	}

}
