import java.util.Scanner;
public class array2D{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows of the matrix:");
		int rows=sc.nextInt();
		System.out.println("Enter the no of columns of the matrix:");
		int columns=sc.nextInt();

		int matrix[][]=new int[rows][columns];
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns;j++){
				System.out.print("Enter the values:");
				matrix[i][j]=sc.nextInt();
			}
		}
	sc.close();

		for(int i=0; i<rows; i++){
                        for(int j=0; j<columns;j++){
                                System.out.print(matrix[i][j]+" ");
                        }
		System.out.println( );
                }

}
}
