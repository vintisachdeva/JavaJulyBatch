import java.util.Scanner;


public class IfElseDemo {

	public static void main(String[] args) {
		
		//command line arguments
		//wrapper classes
		/*int value1 = Integer.parseInt(args[0]);
		
		int value2 = Integer.parseInt(args[1]);;
		
		int value3 = Integer.parseInt(args[2]);;
		*/
		
		int value1, value2, value3;
		
		//class obj_name = new(memory allocation) Scanner()--> constructor
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first value");
		value1 = scanner.nextInt();
		
		System.out.println("Enter your second value");
		
		value2 = scanner.nextInt();
		
		System.out.println("Enter your third value");
		
		value3 = scanner.nextInt();
		
		
		if(value1>value2 && value1> value3)
		{
			System.out.println("value 1 is greater");
			System.out.println("");
		}
			else 
			if(value2 > value1 && value2 > value3){
			
				System.out.println("value 2 is greater");
		} else 
		{
			System.out.println("value 3 is greater");
		}

	}

}
