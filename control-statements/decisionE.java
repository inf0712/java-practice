import java.util.Scanner;
public class decisionE{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("option1:");
	System.out.println("option 2:");
	System.out.println("option3:");
	System.out.println("Enter a choice from the above:");
	int choice=sc.nextInt();

	switch(choice){
		case 1:
			System.out.println("you chose option 1");
		break;

		case 2:
                        System.out.println("you chose option 2");
                break;

		case 3:
                        System.out.println("you chose option 3");
                break;

		default:
			System.out.println("Invalid choice");
		break;

	}
	sc.close();
	}
}
