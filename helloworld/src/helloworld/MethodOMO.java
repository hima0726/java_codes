package helloworld;
class Backpack{
	void put(String item) {
		System.out.println("you put" +item+ "in ur backpack");
	}

	void put(String item, int quality) {
		System.out.println("you put" +quality+""+item+ "in ur backpack");
	}
}
public class MethodOMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Backpack myBP=new Backpack();
		myBP.put("book");
		myBP.put("toy",3);

	}
}	
