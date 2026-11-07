public class decisionD{
	public static void main(String args[]){
		for(int num=1; num<=10; num++){
			if(num<=7){
				if(num<=4){
					System.out.println("Number is less than 4 and 7");
				}
				else{
					System.out.println("Number is greater than 4 and less than 7");
				}
			}
			else{
				System.out.println("Number is greater than 7");
			}
		}
	}
}
