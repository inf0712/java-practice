//elseif
public class decisionC{
	public static void main(String args[]){
		for(int i=0; i<=20; i++){
			if(i<=6){
				System.out.println(i+" is less than or equal to six");
			}
			else if(i<=15){
				System.out.println(i+" is less than or equal to 15");
			}
			else{
				System.out.println("Out of bound 15");
			}
		}
	}
}
