import java.util.Scanner;
public class assign2{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter available 5$ notes :");
	int note5=sc.nextInt();
	System.out.print("Enter available 1$ notes :");
        int note1=sc.nextInt();

	System.out.print("Enter the purchase amount :");
        int amount=sc.nextInt();

	if((5*note5)+note1 >= amount ){
		int a=amount/5;
		int b=amount%5;
		System.out.println("No.of notes of 5$ is "+a);
		System.out.println("No.of notes of 1$ is "+b);
	}
	else{
		int c=5*note5+note1;
		int d=c-amount;
		System.out.println("the amount after purchase is "+d);
	}

	}
}
