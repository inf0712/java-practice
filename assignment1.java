import java.util.*;

public class assignment1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Total heads found = ");
		int heads=sc.nextInt();
		System.out.println("Total legs found = ");
                int legs=sc.nextInt();

		int y= (legs/2)-heads;
		int x= (4*heads-legs)/2;
		System.out.println("the no.of chicken found is "+x);
		System.out.println("the no.of rabbits found is "+y);
		}
}
