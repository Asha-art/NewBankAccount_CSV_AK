package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

		List<Account> accounts = new LinkedList<Account>();

		String file = "NewBankAccounts.csv";

		/*
		 * Checking chkacc1 = new Checking("Tom Jerry","291833489",1534); Savings
		 * savacc1= new Savings("John Doe","392399278",2172);
		 * 
		 * savacc1.compound();
		 * 
		 * savacc1.showInfo(); System.out.println("***********"); chkacc1.showInfo();
		 */

		/*
		 * savacc1.deposit(5000); savacc1.withdraw(390); savacc1.transfer("Brokerage",
		 * 3000);
		 */

		// Read a CSV file then create new accounts based on that data
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			System.out.println("New Account: ");
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);

			if (accountType.equals("Savings")) {
				System.out.println("Open a Savings Account");
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.contentEquals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("Error reading account type");
			}

		}
		// accounts.get(5).showInfo();
		for (Account acc : accounts) {
			System.out.println("\n**************");
			acc.showInfo();
		}
		// accounts.get((int)Math.random() * accounts.size()).deposit(10000);
		// accounts.get((int)Math.random() * accounts.size()).deposit(1500);
	}

}
