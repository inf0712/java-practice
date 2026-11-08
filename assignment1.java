import java.util.*;

public class assignment1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Total heads found = ");
		double heads=sc.nextDouble();
		System.out.println("Total legs found = ");
                double legs=sc.nextDouble();

		double y= (legs/2)-heads;
		double x= heads-y;

		if(y % 1 != 0){
			System.out.println("The no.of chickens and rabbits cannot be found");

		}
		else{
			System.out.println("the no.of chicken found is "+x);
			System.out.println("the no.of rabbits found is "+y);
		}
		}
}
