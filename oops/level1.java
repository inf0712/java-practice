class Student{
	String name;
	int age;
	String course;

	void display(){
	System.out.println("Name is "+name);
	System.out.println("Course is "+course);
	System.out.println("Age is "+age);
	}
}

public class level1{
	public static void main(String[] args){
	Student stud1=new Student();
	Student stud2=new Student();

	stud1.name="Afsal";
	stud2.name="Aswin";

	stud1.age= 23;
	stud2.age= 22;

	stud1.course="DevOPs";
	stud2.course="Cyber";

	stud1.display();
	stud2.display();
	}
}
