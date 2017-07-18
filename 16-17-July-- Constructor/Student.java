import java.util.Scanner;

public class Student {

	//global variables--> instance variables
	//initialize with default value
	
	int rollno;
	String name;
	float salary;
	
	Integer marks[] = new Integer[3] ;
	
	
	void data(){
		Float data[] = new Float[3];
		Scanner scanner = new Scanner(System.in);
		
		
		data[1] = scanner.nextFloat();
		
		rollno = 1;
		name = "ram";
	}
	
	public static void main(String[] args) {
		
		//local variable
		//no default assigned 
		int rollno = 1;
		String name = "mohan";

		Scanner scanner = new Scanner(System.in);
		
		
		Student ram = new Student();//default cons--> global variables default value
	
			
		ram.salary = 1000.32f;
		
		//ram.name = "ram";

		System.out.println("Rollno is= " + rollno + " Name is= " + name);
		System.out.println("Name " + '\t' + "");

		ram.data();
		
		System.out.println(ram.name);
		System.out.println(ram.rollno);		

		System.out.println(name);
		System.out.println(rollno);
		
	}

}
