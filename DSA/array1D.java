import java.util.Scanner;
public class array1D{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in)
;
	System.out.println("Enter the length of the array :");
	int size=sc.nextInt();

	int structure[]=new int[size];

	for(int i=0; i<size; i++){
		System.out.println("Enter the value "+ i+1 + " in the array:");
		structure[i]=sc.nextInt();
	}
	sc.close();

	for(int i=0; i<size; i++){
		System.out.println(structure[i]);
	}
}
}
