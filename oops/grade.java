class student{
	String name;
	float mark1,mark2,mark3;

	float total(){
		return mark1+mark2+mark3;
	}

	float avg(){
		return (mark1+mark2+mark3)/3;
	}
	char grad(){
		if(avg()>=90){
			return 'A';
		}
		else if(avg()>80 &&  avg()<89){
			return 'B';
		}
		else if(avg()>70 &&  avg()<79){
                        return 'C';
		}
		else if(avg()>60 &&  avg()<69){
                        return 'B';
		}
		else{
			return 'F';
		}
	}

	void display(){
		System.out.println("Name is "+name);
		System.out.println("Total Mark is "+total());
		System.out.println("Average is "+avg());
		System.out.println("Grade is "+grad());
		
	}

}

public class grade{
	public static void main(String args[]){
		String Name="Martin";
		float mark1= 90;
		float mark2= 86;
		float mark3= 100;

		student s1=new student();

		s1.name=Name;
		s1.mark1=mark1;
		s1.mark2=mark2;
		s1.mark3=mark3;
		
		s1.total();
		s1.avg();
		s1.grad();
		s1.display();


	}
}
