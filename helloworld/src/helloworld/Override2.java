package helloworld;
class animal{
	void put() {
		System.out.println("Animals in forest");
	}
}
class puppy extends animal{
	void put() {
		System.out.println("Animals in town");
	}
}
public class Override2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal A=new animal();
		A.put();
		animal P=new puppy();
		P.put();

	}

}
