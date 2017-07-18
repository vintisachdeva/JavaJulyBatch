
public class ConstructorDemo {

	String name;
	String collegeName;
	String address;
	float percentage;
	
	
	
	//default constructor
	ConstructorDemo(){
		collegeName = "VIPS";
	}
	
	
	//parameterized constructor
	ConstructorDemo(String name){
	//	this();// to call current class variables, constructors, methods 
		this.name = name;	
	}
	
	ConstructorDemo(String address, float percentage){
		this("reew");
		this.address = address;
		this.percentage = percentage;
		
	}
	
	void input(){
		System.out.println("Name is = " +name);
		System.out.println("CollegeName is = " +collegeName);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo obj = new ConstructorDemo();
		obj.input();
	}
}
