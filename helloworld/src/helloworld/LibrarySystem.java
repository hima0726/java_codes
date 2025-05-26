package helloworld;
class LibraryItem{
	void CheckIn() {
		System.out.println("Library item checked in");
	}
}
class Book extends LibraryItem{
	void readBook() {
		System.out.println("Reading the book");
	}
}
class TextBook extends Book{
	void SloveExercises() {
		System.out.println("Solving exercises in textbook");
	}
}

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextBook TB=new TextBook();
		TB.CheckIn();
		TB.readBook();
		TB.SloveExercises();
	}

}
