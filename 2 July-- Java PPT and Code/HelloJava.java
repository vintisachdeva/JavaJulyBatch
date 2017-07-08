
public class HelloJava {

	//static--> no need to create object for calling main method
	//main-- name of method
	// String--> Predefined class
	public static void main(String[] w) 
	{
		//System-- Predefined class
		//out--> object 
		//println()

		//Primitive
		//int value1 = 10;
		int value2 = 10;
		
		//Reference--> address
		Integer value1 = new Integer(10);//--> new memory--> 10
		//Integer value2 = new Integer(20);//--> new memory--> 10
		
		//String value1 = new String("Hello");
		//String value2 = new String("hello");
		
		
		//System.out.println(value1 == value2);
		//System.out.println(value1.equals(value2));
		
		System.out.println(value1 == value2);
		System.out.println("value1 = " + value1 + "value2 = " + value2);
	}

}




