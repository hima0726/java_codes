package helloworld;
class parent{
	void work() {
		System.out.println("parents are working");
	}
}
class boy extends parent{
	void play() {
		System.out.println("the boy is playing");
	}
}
class girl extends parent{
	void study() {
		System.out.println("the girl is studying");
	}
}
public class Hierarchical {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		boy b1=new boy();
		b1.work();
		b1.play();
		girl g1=new girl();
		g1.work();
		g1.study();
	}
}
