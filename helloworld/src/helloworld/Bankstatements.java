package helloworld;
class BankAccount{
	void display(int amount) {
		System.out.println("deposit: "+amount);
	}

void display(int amount,String Account) {
	System.out.println("deposit: "+amount +""+"account: "+Account);
}

void display(String Branch,int amount,String Account) {
	System.out.println("deposit: " +amount+""+ "account: " +Account+""+"branch: "+Branch);
}
}
public class Bankstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BankAccount BA=new BankAccount();
   BA.display(2000);
   BA.display(4000, "ac4567");
   BA.display( "ac4567",4000,"canara");
	}
}