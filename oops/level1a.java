class mobile{
	String brand;
	String model;
	int price;

	void makecall(){
		System.out.println("Calling");
	}
	void display(){
	System.out.println(brand);
	System.out.println(model);
	System.out.println(price);
	}
}

public class level1a{
	public static void main(String args[]){
		mobile mob1=new mobile();
		mobile mob2=new mobile();

		mob1.brand="vivo";
		mob2.brand="apple";

		mob1.model="x500";
		mob2.model="18pro";

		mob1.price=75000;
		mob2.price=115000;

		mob1.makecall();
		mob1.display();

		mob2.makecall();
		mob2.display();
	
	}
}
