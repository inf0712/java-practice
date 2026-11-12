import java.util.Scanner;
public class search{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of the array :");
        int size=sc.nextInt();

        int structure[]=new int[size];

        for(int i=0; i<size; i++){
                System.out.println("Enter the value "+ i+1 + " in the array:");
                structure[i]=sc.nextInt();
        }

	System.out.println("Enter the element to be searched: ");
        int ping=sc.nextInt();

	int flag=0;
        for(int j=0; j<size; j++){
                if(ping==structure[j]){
                	flag=1;
			break;
                }
                else{
                	flag=0;
                }
        }

	if(flag==1){
                        System.out.println("ping available at index");
                }
                else{
                        System.out.println("ping not available");
                }

}
}
