import java.util.*;

public class lcm{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the first number");
                int num1=sc.nextDouble();
                System.out.println("enter the second number");
                int num2=sc.nextDouble();

		for(int i=1; ; i++){
           		for(int j=1; ; j++){
				if(num1*i==num2*j){
					System.out.println(num1*i+" is the LCM");
					return;
				}
				if(num2*j>num1*i){
					break;
				}
				}
			}
                }
}

