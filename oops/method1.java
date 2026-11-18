import java.util.Scanner;
public class method1{
		static int add(int a,int b){
			return a+b;
		}
	        public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first number to add: ");
			int num1=sc.nextInt();
			System.out.println("enter second number to add: ");
                        int num2=sc.nextInt();

			int sum=add(num1,num2);
			System.out.println("Sum of the numbers is "+sum);
}
}
