package oops1.Staticandnonstatic;

public class TestBank {

	public static void main(String[] args) {

		Bank b1 = new Bank();
		b1.Bank_name = "HSEB bank";
		b1.accountBalanace = 10000;
		b1.intrestGained(5000);
		System.out.println(b1.accountBalanace);

		// create object of member class

		Members m = new Members();
		m.add = "1801 Test address";
		m.User_name = "jack daniels";
		b1.mem = m;
		System.out.println(b1.mem.add);

		// no need to create object of member class as i can access all the var
		// of member from bank class

		// create object of another class by reference

		Bank b2 = new Bank();
		b2.accountBalanace = 20000;

		b2.Bank_name = "Western Union Bank";
		b2.intrestGained(2000);
		b2.mem = new Members();
		b2.mem.add = "1802 address australia ";
		b2.mem.User_name = "jack sparrow";
		b2.getBalance();

		Members m2 = b2.getBalance();
		m2.deposit();
		m2.Withdrawl();

		b2.getBalance().Withdrawl();
		b2.getBalance().deposit();
	}

}
