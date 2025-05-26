package helloworld;
class Account{
	void openAccount() {
		System.out.println("Open Account");
	}
}
class SavingsAccount extends Account{
	void depositSavings() {
		System.out.println("Deposit for Savings Account");
	}
}
class CurrentAccount extends Account{
	void issueChequeBook() {
		System.out.println("Chequebook issued for Current Account");
	}
}
public class Bankingsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount S=new SavingsAccount();
		S.openAccount();
		S.depositSavings();
		CurrentAccount C=new CurrentAccount();
		C.openAccount();
		C.issueChequeBook();
	}

}
