class Bill{
	String custName;
	float unitsConsumed;
	float billAmount;
	float excess = unitsConsumed-100;
	float limit = unitsConsumed-200;

	float calculateBill(){
		if(unitsConsumed<101){
			return unitsConsumed*2;
		}
		else if(unitsConsumed<201){
			return (100*2)+((unitsConsumed-100)*3);
		}
		else{
			return (100*2)+(100*3)+((unitsConsumed-200)*5);
		}
	}

	void display(){
		System.out.println("Customer name is "+custName);
		System.out.println("Units comsumed is "+unitsConsumed);
		System.out.println("Total bill is "+calculateBill());
	}
}

public class electricBill{
	public static void main(String args[]){
		Bill one = new Bill();
		String name ="Martin";
		float units = 270; 

		one.custName = name;
		one.unitsConsumed = units;
		one.display();
			
	}
}

