class rectangle{
	int length;
	int breadth;

	int area(){
		return length*breadth;
	}
	int perimeter(){
		return 2*(length+breadth);
	}
	void display(){
		System.out.println("Length is "+length);
		System.out.println("Breadth is "+breadth);
	}
}

public class shape{
	public static void main(String args[]){
	int len=10;
	int bre=5;

	rectangle rec=new rectangle();
	rec.length=len;
	rec.breadth=bre;

	System.out.println("Area is "+rec.area());
	System.out.println("Perimeter is "+rec.perimeter());
	rec.display();
	}
}
