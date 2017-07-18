import java.util.Scanner;

//java bean
public class GoodEncapsulation {

	private String studentName;
	private String address;
	
	//public setters and getters--> 
	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	
	
	
	
	
	/*void input()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		studentName = scanner.nextLine();
		
		System.out.println("Enter your address");
		
		address = scanner.nextLine();
		
		
	}
	
	void output(){
		
		System.out.println("Your name is= "+studentName);
		System.out.println("Your address is= "+address);
	}*/
	
	public static void main(String[] args) {
	
								//constructor
		Scanner scanner = new Scanner(System.in);
		
									//constructor
		GoodEncapsulation obj = new GoodEncapsulation();
		
		System.out.println(obj.studentName);
		
		System.out.println("Enter your value");
		
		obj.setStudentName(scanner.nextLine());
		
		System.out.println(obj.getStudentName());

	}


}
