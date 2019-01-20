package oops1.Staticandnonstatic;

public class Bank {

	String Bank_name;
	int accountBalanace;
	Members mem;

	public int intrestGained(int increment) {
		accountBalanace = accountBalanace + increment;
		return accountBalanace;
	}

	public Members getBalance() {

		return mem;

	}
}
