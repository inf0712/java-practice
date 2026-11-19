class details{
	String name;
	int empID;
	double salary;

	double calBonus(){
		return 0.1*salary;
	}
	double totalSal(){
		return salary+calBonus();
	}
	void display(){
		System.out.println("Employee name: "+name);
		System.out.println("Employee ID: "+empID);
		System.out.println("Basic Salary: "+salary);
		System.out.println("Bonus : "+calBonus());
		System.out.println("Total Salary: "+totalSal());
	}
}

public class emp{
	public static void main(String args[]){
		details emp1=new details();
		details emp2=new details();
		
		emp1.name="Afsal";
		emp2.name="Aswin";

		emp1.empID=100;
		emp2.empID=101;

		emp1.salary=30000;
		emp2.salary=45000;

		emp1.calBonus();
		emp1.totalSal();
		emp1.display();

		emp2.calBonus();
                emp2.totalSal();
                emp2.display();

	}
}
