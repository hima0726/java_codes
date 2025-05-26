package helloworld;
abstract class ATM{
	abstract void withdraw(double amount);
	abstract void deposite(double amount);
	abstract void balance();
void welcome() {
	System.out.println("Welcome to ATM");
}
}
abstract class SBI extends ATM{
	double balance = 5000;
	@Override
	void withdraw(double amount) {
		if (amount>balance) {
			System.out.println("Insufficient balance");
		}else {
			balance -=amount;
			System.out.println("withdraw" +amount);
		}
	}
	@Override

	void deposite(double amount) {
		balance +=amount;
		System.out.println("deposite" +amount);
	}
	
	void balance() {
		System.out.println("current balance: "+balance);
	}
}
public class ATMTest {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI C =new SBI();
		C.welcome();
		C.deposite(1000);
		C.balance();
		C.withdraw(2000);
		C.balance();
    }
}
