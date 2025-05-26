package helloworld;
interface ATMOperations {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
    default void pin()
    {
    	System.out.println("enterpin");
    }
}
class ATMImpl implements ATMOperations {
    private double balance = 5000;
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
public class ATM_Operations {
    public static void main(String[] args) {
    	ATMImpl atm = new ATMImpl();
        atm.pin();
        atm.deposit(1500);
        atm.pin();
        atm.withdraw(1000);
        atm.pin();
        atm.checkBalance();
    }
}