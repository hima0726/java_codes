package helloworld;

public class ModelsofCar {
	String model, color, brand;
	int size, speed;
	void setdetails(String model,String color,String brand,int size,int speed) {
		this.model=model;
		this.color=color;
		this.brand=brand;
		this.size=size;
		this.speed=speed;
		}
	void display() {
		System.out.println("Model of a Car: "+model);
		System.out.println("Color of a Car: "+color);
		System.out.println("Brand of a Car: "+brand);
		System.out.println("Size of a Car: "+size+"mm");
		System.out.println("Speed of a Car: "+speed+"kmph");
	}
	

	public static void main(String[] args) {
		ModelsofCar c1=new ModelsofCar();
		c1.setdetails("Ertiga", "Mehroon", "Maruti", 170,4395);
		c1.display();
		
		ModelsofCar c2=new ModelsofCar();
		c2.setdetails("XUV700", "black", "maruti", 160-120,4695);
		c2.display();
		
		ModelsofCar c3=new ModelsofCar();
		c3.setdetails("Swift", "Red", "Maruti", 165,3845);
		c3.display();
		

	}

}
