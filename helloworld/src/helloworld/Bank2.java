package helloworld;

class Hima{

    
    void deposit(double amount) {
        System.out.println("Deposited: " + amount);
    }

  
    void deposit(double amount, String accountNumber) {
        System.out.println("Deposited: " + amount + " into Account: " + accountNumber);
    }

   
    void deposit(double amount, String accountNumber, String branchCode) {
        System.out.println("Deposited: " + amount + " into Account: " + accountNumber + " at Branch: " + branchCode);
    }
    public class Bank2{
    public static void main(String[] args) {
       Hima acc = new Hima();
        acc.deposit(1000.10);
        acc.deposit(1500.0, "AC12345");
        acc.deposit(2000.0, "AC12345", "BR007");
    }
}
}