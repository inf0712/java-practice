class cal{
	int add(int a,int b){
		return a+b;
	}
	int subtract(int a, int b){
		return a-b;
	}
	int multiply(int a,int b){
		return a*b;
	}
	int divide(int a,int b){
		return a/b;
	}	
}

public class calculator{
	public static void main(String args[]){
	cal operate=new cal();
	
	System.out.println("Sum is "+operate.add(10,20));
	System.out.println("Subtract is "+operate.subtract(10,20));
	System.out.println("Multiply is "+operate.multiply(10,20));
	System.out.println("Divide is "+operate.divide(10,20));
	}
}
