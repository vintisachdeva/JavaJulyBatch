
class Person{

	//default--> accessible inside package
	
	//protected--> inheritance 
	public String name;//accessible within class
	String address;
	
	void data(){
		//System.out.println("Name is = "+ name);
		System.out.println("data method of Person class");
	}
	
}

class StudentNew extends Person{
	
	String studName;
	int id;
	
	void studDetails(){
		name = "Ram kumar";
		data();
		
	}
	
	void data(){
		//super keyword
		//super --> points to parent
		super.data();
		System.out.println("data method of StudentNew class");
	}
	
	
	Person person = new Person();
	
	public static void main(String args[]){
	
		StudentNew obj = new StudentNew();
		
		obj.studDetails();	
		
	}

}

class Student1 extends StudentNew,Person{
	
	void student1(){
	
		name = "";
	}
	
}



public class SingleInherit {

	public static void main(String[] args) {

	/*	Person person = new Person();
		
		
		Student1 obj = new Student1();
		obj.data();*/
		//scope
		
		//inheritance -->upcasting and downcasting
		Person obj = new Student1();
		
		obj.data();	
		
	}
}
