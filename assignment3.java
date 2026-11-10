import java.util.Scanner;
public class assignment3{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the marks of each subject");
	int marks[]=new int[5];
	for(int i=0; i<marks.length; i++){
		System.out.println("Enter the marks of subject"+i+1+":");
		marks[i]=sc.nextInt();
	}
	int sum=0;
	double average=0;

	for(int i=0; i<marks.length; i++){
                sum = sum+marks[i];
        }
	average=sum/5;

	if(average>=90){
		System.out.println("Grade:A");
	}
	else if(average>=80){
                System.out.println("Grade:B");
        }
	else if(average>=70){
                System.out.println("Grade:C");
        }
	else if(average<=50){
                System.out.println("Grade:Fail");
        }

	System.out.println("Sum:"+sum);
	System.out.println("Average:"+average);

}
}
