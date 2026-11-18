class details{
	String brand;
	String color;
	int speed;

	void start(){
		System.out.println("Car started");
	}

	void accelerate(){
		this.speed = this.speed + 10;
	}

	void display(){
		System.out.println(brand);
		System.out.println(color);
		System.out.println(speed);
	}
}

public class carspec{
	public static void main(String[] args){
		details car1 = new details();

		car1.brand = "Suzuki";
		car1.color = "Black";
		car1.speed = 50;

		car1.start();
		car1.accelerate();
		car1.display();
	}
}
