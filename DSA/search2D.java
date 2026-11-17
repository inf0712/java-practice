import java.util.Scanner;
public class search2D{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows pf matrix: ");
		int rows=sc.nextInt();
		System.out.println("Enter the no of columns pf matrix: ");
                int columns=sc.nextInt();

		int matrix[][]=new int[rows][columns];

		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				System.out.println("enter the values inside the matrix: ");
				matrix[i][j]=sc.nextInt();
			}
		}


		 for(int i=0; i<rows; i++){
                        for(int j=0; j<columns; j++){
                                System.out.print(matrix[i][j]+" ");
                        }
		System.out.println( );
                }

		System.out.println("Enter the value to be found: ");
		int ping=sc.nextInt();
		int flag=0;

		for(int i=0; i<rows; i++){
                        for(int j=0; j<columns; j++){
                                if(ping==matrix[i][j]){
					flag=1;
					break;
				}
				else{
					flag=0;
				}
                        }
			if(flag==1){
				break;
			}

                }

		if(flag==1){
			System.out.println("Ping found");
		}
		else{
			System.out.println("key is not found in the matrix");
		}

}
}
