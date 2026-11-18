import java.util.Scanner;
public class square{
	static int squ(int num){
		return num*num;
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num1=sc.nextInt();

		int result=squ(num1);
		System.out.println("Square of the number given is "+result);
}
}
