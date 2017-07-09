import java.util.Scanner;


public class WhileDemo {

	public static void main(String[] args) {
		
//		int value;
		
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Enter value");
		
		int num = scanner.nextInt();
		System.out.println("user value is=" + num);
		*/
		
		System.out.println("Enter your name");
		//String name = scanner.next();// data before space
		String name = scanner.nextLine();//data before next line--> \n
		System.out.println("User name is=" +name);
				
		for(int value = 10; value>=1; value--){
			System.out.println(value);
		}
		
		
	
		/*do{
	
			System.out.println(value);
			value--;
			
		}while(value>=1);
	*/	
		/*while(value>=1){//11<=10
			
			System.out.println(value);//12
			value--;//2
			
		}*/

	}

}
