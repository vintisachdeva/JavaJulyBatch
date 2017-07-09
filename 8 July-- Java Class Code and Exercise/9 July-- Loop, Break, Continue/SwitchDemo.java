import java.util.Scanner;


public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number between [1-7]");
		
		int day = scanner.nextInt();
		
		switch(day){
		
		case 1:
			System.out.println("1 stands for Monday");
		break;
		
		default:
			System.out.println("No should be between [1-7]");
		break;
		
		case 2:
			System.out.println("2 stands for Tuesday");
			break;

		case 3:
			System.out.println("3 stands for Wednesday");
			break;
			
			
		}
		
		System.out.println("Switch exit");
		/*if(day == 1){
			
		} else if(day == 2){
			
		}*/
		
		

	}

}
