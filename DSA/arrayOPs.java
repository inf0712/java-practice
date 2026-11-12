import java.util.Scanner;
import java.util.Arrays;
public class arrayOPs{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array required: ");
		int size=sc.nextInt();
		int structure[]=new int[size];

		for(int i=0; i<size; i++){
			System.out.print("Enter the value "+i+" in the array: ");
			structure[i]=sc.nextInt();
		}

		sc.close();
		for(int i=0; i<size; i++){
                        System.out.print(structure[i]+" ");
		}

		int sum=0;
		for(int i=0; i<size; i++){
			sum=sum+structure[i];
		}

		double avg=sum/size;
		System.out.println("Sum is "+sum+" And average is "+avg);

		int max=structure[0];
		int min=structure[0];
		int i=0;
		while(i<size){
			if(max<structure[i]){
				max=structure[i];
			}

			if(min>structure[i]){
				min=structure[i];
			}
			i++;
		}
		System.out.println("Largest element in the array is: "+max);
		System.out.println("Smallest element in the array is: "+min);

}
}
